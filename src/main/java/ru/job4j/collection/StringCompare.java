package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int minLength = Math.min(left.length(), right.length());
        for (int i = 0; i < minLength; i++) {
            char charLeft = left.charAt(i);
            char charRight = right.charAt(i);
            int charCompar = Character.compare(charLeft, charRight);
            if (charCompar != 0) {
                return charCompar;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
