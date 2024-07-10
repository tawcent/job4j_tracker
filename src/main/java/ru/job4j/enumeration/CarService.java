package ru.job4j.enumeration;

public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Status Toyota: " + toyota);
        System.out.println("Status Volvo: " + volvo);
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println("Name status: " + s.name() + ", Status №: " + s.ordinal());
        }
        String accepted = "ACCEPTED";
        Status status = Status.valueOf(accepted);
        System.out.println(status);

        switch (status) {
            case ACCEPTED:
                System.out.println("Status: Auto on STO");
                break;
            case IN_WORK:
                System.out.println("Status: Auto in work");
                break;
            case WAITING:
                System.out.println("Status: Auto waiting");
                break;
            case FINISHED:
                System.out.println("All work finished");
                break;
            default:
        }
    }
}
