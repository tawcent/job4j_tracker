package ru.job4j.enumeration;

public enum Status {
    ACCEPTED("Prinyat"),
    IN_WORK("V rabote"),
    WAITING("Ogidanie klienta"),
    FINISHED("Ended");

    private final String text;

    Status(String text) {
        this.text = text;
    }

    public String info() {
        return text;
    }

    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Status toyota: " + toyota.info());
        System.out.println("Status volvo: " + volvo.info());
    }
}
