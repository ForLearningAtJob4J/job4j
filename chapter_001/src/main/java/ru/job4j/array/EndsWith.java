package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int delta = word.length - post.length;
        if (post.length <= word.length) {
            for (int i = 0; i < post.length; i++) {
                if (word[delta + i] != post[i]) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
