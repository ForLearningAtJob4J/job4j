package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int dest = array.length - 1 - i;
            int temp = array[dest];
            array[dest] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
