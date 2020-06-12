package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("vasya@bk.ru", "Kvasin Vasya Hottabovich");
        map.put("artemon@bk.ru", "Artenomov Artemiy Vlasovich");
        map.put("bugaga@bk.ru", "Undinov Stepan Lvovich");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
