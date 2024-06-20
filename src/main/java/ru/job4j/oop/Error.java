package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {

    }

    public void printInfo() {
        System.out.println("Активность : " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 1, "Не найдена");
        error.printInfo();
        Error danger = new Error(false, 0, "Критическая ошибка");
        danger.printInfo();
        Error deferror = new Error();
        deferror.printInfo();
    }
}
