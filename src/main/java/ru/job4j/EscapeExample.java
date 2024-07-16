package ru.job4j;

public class EscapeExample {
    public static void main(String[] args) {
        String string = "Ya izychay na 'Job4j' ektanirovanie simvolov";
        System.out.println(string);
        System.out.println("\'");
        System.out.println("C:\\projects\\job4j\\File.java");
        System.out.print("Starii dlinnii text\r");
        System.out.println("new text");
        System.out.print("One stroka\nTwo stroka\n");
        System.out.println("bez otstypa");
        System.out.println("\tOne otstyp");
        System.out.println("\t\tTwo otstyp");
        System.out.println("job4jjj\b\b");
    }
}
