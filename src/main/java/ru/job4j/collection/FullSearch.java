package ru.job4j.collection;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
public class FullSearch {

    public Set<String> extractNumber(List<TaskUniq> list) {
        HashSet<String> numbers = new HashSet<>();
        for (TaskUniq num : list) {
            numbers.add(num.getNumber());
        }
        return numbers;
    }
}
