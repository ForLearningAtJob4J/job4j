package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DepartmentsComparatorTesting {
    static final int ROWS_NUM = 1000;
    static final int DEPTH = 10;

    static void fillList(List<String> inp) {
        inp.clear();
        Random rm = new Random(System.nanoTime());
        for (int i = 0; i < ROWS_NUM; i++) {
            int maxNesting = rm.nextInt(DEPTH) + 1;
            StringBuilder deps = new StringBuilder();
            String prefs = "";
            for (int j = 0; j < maxNesting; j++) {
                deps.append(prefs).append("K").append(rm.nextInt(DEPTH) + 1).append('/');
                prefs = prefs + "S";
            }
            deps = new StringBuilder(deps.substring(0, deps.length() - 1));
            inp.add(deps.toString());
        }
    }

    public static void main(String[] args) {
        List<String> inp = new ArrayList<>();
        fillList(inp);
        List<String> inp2 = new ArrayList<>(inp);
        List<String> inp3 = new ArrayList<>(inp);

        long timeMillis = System.currentTimeMillis();
        inp2.sort(new DepDescCompFast());
        System.out.println("Previous version: " + (System.currentTimeMillis() - timeMillis) + " ms");

        timeMillis = System.currentTimeMillis();
        inp3.sort(new DepDescComp());
        System.out.println("Current version: " + (System.currentTimeMillis() - timeMillis) + " ms");
        System.out.println("Arrays are equal: " + inp2.equals(inp3));
//        for (String s: inp) {
//            System.out.println(s);
//        }
    }
}
