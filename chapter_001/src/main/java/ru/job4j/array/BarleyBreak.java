package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int c = 1;
        int[][] table = new int[3][3];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = c++;
            }
        }
    }
}
