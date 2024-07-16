package ru.job4j.concat;

import java.time.chrono.MinguoDate;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Job4j");
        for (int i = 0; i < 9999; i++) {
            builder.append(i);
        }
        System.out.println("Millisec " + (System.currentTimeMillis() - startTime));
    }
}
