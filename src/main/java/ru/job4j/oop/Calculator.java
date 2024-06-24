package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int c) {
        return c - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperations() {
        return sum(5) + minus(5) + divide(5) + multiply(5);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5);
        System.out.println("Умножение : " + result);
        int resultallsum = calculator.sumAllOperations();
        System.out.println("Сумма всех операций : " + resultallsum);
        int resultdiv = calculator.divide(10);
        System.out.println("Деление : " + resultdiv);
        int resultminus = minus(10);
        System.out.println("Вычитание : " + resultminus);
        int resultsum = sum(5);
        System.out.println("Сложение : " + resultsum);

    }
}