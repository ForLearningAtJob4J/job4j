package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int ret = 0;
        int len1 = left.length();
        int len2 = right.length();
        int bound = Math.min(len1, len2);
        for (int i = 0; i < bound; i++) {
            int dif = Character.compare(left.charAt(i), right.charAt(i));
            if (dif != 0) {
                ret = dif;
                break;
            }
        }

        return (ret == 0) ? Integer.compare(len1, len2) : ret;
    }
}