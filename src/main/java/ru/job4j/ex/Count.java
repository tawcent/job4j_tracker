package ru.job4j.ex;

public class Count {
    public static int add(int start, int finish) {
        if (start > finish) {
            throw new IllegalArgumentException("Start should be less than finish");
        }
        int result = 0;
        for (int i = start; i != finish; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 to 10 is: " + add(2, 10));
    }
}
