package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
//        finish = (finish > array.length - 1) ? array.length - 1 : finish;
//        start = (start > array.length - 1) ? array.length - 1 : start;
        for (int index = start + 1; index <= finish; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
