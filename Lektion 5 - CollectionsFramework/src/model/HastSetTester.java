package model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HastSetTester {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set = Stream.of("34", "12", "23", "45", "67", "34", "98").collect(Collectors.toSet());
        System.out.println(set);
        // Lig mærke til 34 kun optræder 1 gang
        set.add("23");
        System.out.println(set);
        // 23 optræder ikke
        set.remove("67");
        System.out.println(set);
        // fjerne 67

        // Skriv kode der undersøger om mængden indeholder elementet 23

        for (int i = 0; i < set.size(); i++) {
            if (set.contains("23")) {
                System.out.println("Ja");
            } else {
                System.out.println("Nej");
            }
        }
    }

}
