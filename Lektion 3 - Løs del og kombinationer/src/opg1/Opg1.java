package opg1;

import java.util.ArrayList;

public class Opg1 {
    public static int summen(ArrayList<Integer> list) {
        return sum(list, 0, list.size() - 1);
    }

    private static int sum(ArrayList<Integer> list, int l, int h) {
        int total = 0;
        if (l == h) {
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            int max1 = sum(list, l, m);
            int max2 = sum(list, m + 1, h);

            total = max1 + max2;
        }
        return total;

    }
}
