package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        list.add(new int[] {1, 2, 3});
        list.add(new int[] {4, 5, 6});
        for (int[] row : list) {
            for (int cell : row) {
                result.add(cell);
            }
        }
        return result;
    }
}
