package fletning;

import java.util.ArrayList;

public class FletteSorteringMedTODO {
    // den metode der saetter fletningen i gang
    public void fletteSort(ArrayList<Integer> list) {
        mergesort(list, 0, list.size() - 1);
    }

    // den rekursive metode der implementere del-loes og kombiner skabelonen
    private void mergesort(ArrayList<Integer> list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(list, l, m);
            mergesort(list, m + 1, h);
            merge(list, l, m, h);
        }
    }

    // kombiner er realiseret ved fletteskabelonen
    private void merge(ArrayList<Integer> list, int low, int middle, int high) {
        ArrayList<Integer> s1 = new ArrayList<>(list.subList(low, middle + 1));
        ArrayList<Integer> s2 = new ArrayList<>(list.subList(middle + 1, high + 1));
        ArrayList<Integer> tmp = new ArrayList<>();

        int i1 = 0;
        int i2 = 0;

        // flet sålænge der er noget i begge lister
        while (i1 < s1.size() && i2 < s2.size()) {
            if (s1.get(i1).compareTo((s2.get(i2))) <= 0) {
                // s1's første tal er mindst
                tmp.add(s1.get(i1));
                i1++;
            } else { // s2's første tal er mindst
                tmp.add(s2.get(i2));
                i2++;
            }
        }
        // tøm den liste der ikke er tom
        while (i1 < s1.size()) {
            tmp.add(s1.get(i1));
            i1++;
        }

        for (int i = 0; i < tmp.size(); i++) {
            list.set(low + i, tmp.get(i));
        }
    }

}
