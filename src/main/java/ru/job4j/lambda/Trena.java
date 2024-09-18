package ru.job4j.lambda;

import java.util.ArrayList;

public class Trena {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>() {
            @Override
            public boolean add(Integer o) {
                System.out.println("Dobavili " + o);
                return super.add(o);
            }
        };
        list.add(10500);
    }
}
