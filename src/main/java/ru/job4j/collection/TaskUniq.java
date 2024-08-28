package ru.job4j.collection;

import java.security.PublicKey;

public class TaskUniq {
    private String number;
    private String description;

    public TaskUniq(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

}
