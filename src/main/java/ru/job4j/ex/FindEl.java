package ru.job4j.ex;

import javax.swing.plaf.InsetsUIResource;

public class FindEl {
    public static int indexOf(String[] value, String key) throws UserInputException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
                break;
            }
        }

        if (result == -1) {
            throw new UserInputException("Key could not be search");
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"kid", "weey", "up", "hello"}, "kid");
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
