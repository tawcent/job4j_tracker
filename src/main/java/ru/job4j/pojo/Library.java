package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book garry = new Book("Garry", 200);
        Book gold = new Book("Gold", 250);
        Book hero = new Book("Hero", 300);
        Book cleancode = new Book("Clean code", 222);
        Book[] books = new Book[4];
        books[0] = garry;
        books[1] = gold;
        books[2] = hero;
        books[3] = cleancode;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Book name: " + book.getName() + " - " + "pages : " + book.getCount());
        }

        System.out.println("after replace 0 on 3 index");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Book name: " + book.getName() + " - " + "pages : " + book.getCount());
        }

        System.out.println("Show book name Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println("Book name: " + book.getName() + " - " + "pages : " + book.getCount());
            }
        }
    }
}