package opg1;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(new Integer[] { 5, 6, 8, 8, 0, 0, 0, 0, 5, 5, 0 }));

        // Opg1h
        System.out.println(Opg1.summen(list));

        // Opg2
        System.out.println(Opg2.antalNuller(list));
    }

}
