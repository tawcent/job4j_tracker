package ru.job4j.polymorphism;

import java.io.File;

public class FileStore implements Store {
    private String path;

    public FileStore() { }

    public FileStore(String path) {
        this.path = path;
    }

    public void save(String data) {

    }

    public String read() {
        return null;
    }
}
