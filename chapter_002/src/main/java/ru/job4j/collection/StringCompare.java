package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int i = 0;
        int ret = 0;

        if (!left.equals(right)) {
            while (true) {
                try {
                    ret = left.charAt(i) - right.charAt(i);
                    if (ret != 0) {
                        break;
                    }
                    i++;
                } catch (IndexOutOfBoundsException exception) {
                    ret = left.length() - right.length();
                    break;
                }
            }
        }
        return ret;
    }
}