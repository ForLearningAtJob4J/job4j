package ru.job4j.collection;

import java.util.Comparator;

public class DepDescCompFast implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int res;
        String o1head;
        String o2head;
        int pos = o1.indexOf("/");
        if (pos == -1) {
            o1head = o1;
        } else {
            o1head = o1.substring(0, pos);
        }

        pos = o2.indexOf("/");
        if (pos == -1) {
            o2head = o2;
        } else {
            o2head = o2.substring(0, pos);
        }

        res = o2head.compareTo(o1head);

        return (res == 0) ? (o1.compareTo(o2)) : res;
    }
}
