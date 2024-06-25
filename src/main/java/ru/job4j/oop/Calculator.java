package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int sumAllOperations(int y) {
        return sum(y) + minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5);
        System.out.println("Умножение : " + result);
        int resultallsum = calculator.sumAllOperations(5);
        System.out.println("Сумма всех операций : " + resultallsum);
        int resultdiv = calculator.divide(10);
        System.out.println("Деление : " + resultdiv);
        int resultminus = minus(10);
        System.out.println("Вычитание : " + resultminus);
        int resultsum = sum(5);
        System.out.println("Сложение : " + resultsum);

    }
}