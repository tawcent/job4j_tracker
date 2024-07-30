package ru.job4j.ex;

public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int i = 0; i < shops.length; i++) {
            String element = shops[i];
            if ((element != null) && (element.length() > max)) {
                max = element.length();
            }
        }
        System.out.println("Max length " + max);
    }
}
