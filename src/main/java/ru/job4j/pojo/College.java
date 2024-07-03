package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ruslan Dautov");
        student.setGroup("P - 23");
        student.setData("22.08.2017");
        student.setCreated(new Date());

        System.out.println(student.getName() + "," + " group: " + student.getGroup() + "," + " date- " + student.getData());
    }
}
