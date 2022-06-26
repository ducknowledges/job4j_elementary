package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            int wordLastIndex = word.length - 1;
            int postLastIndex = post.length - 1;
            if (word[wordLastIndex - i] != post[postLastIndex - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
