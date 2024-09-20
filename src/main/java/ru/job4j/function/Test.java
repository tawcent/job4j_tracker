package ru.job4j.function;
import java.util.Comparator;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        String[] names = {
                "Ivan",
                "Good"
        };
        Comparator<String> lengthComparator = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(names, lengthComparator);
    }
}
