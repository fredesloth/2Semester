package opg1;

import java.util.ArrayList;

public class Opg2 {
    public static int antalNuller(ArrayList<Integer> list) {
        return tælNuller(list, 0, list.size() - 1);
    }

    private static int tælNuller(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            if (list.get(l) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {

            int m = (l + h) / 2;
            int max1 = tælNuller(list, l, m);
            int max2 = tælNuller(list, m + 1, h);

            return max1 + max2;
        }

    }
}
