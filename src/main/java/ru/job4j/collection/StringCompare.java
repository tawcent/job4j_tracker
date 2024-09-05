package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < left.length() && i < right.length(); i++) {
            int charCompar = Character.compare(left.charAt(i), right.charAt(i));
            if (charCompar != 0) {
                return charCompar;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
