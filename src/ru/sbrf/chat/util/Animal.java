package ru.sbrf.chat.util;

import java.util.Objects;

public class Animal {
    protected final String type;
    protected String name;
    protected byte weight;


    protected Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    protected void voice() {
        System.out.println("Животное не разговаривает");
    }

    public void setWeight(byte weight) {
        this.weight = weight;
    }
}
