package org.example;

public class Bell {
    private int counter;

    public Bell() {
        this.counter = 0;
    }

    public String getSound() {
        return this.counter % 2 == 0 ? "ding" : "dong";
    }

    public void sound() {
        System.out.println(this.getSound());
        this.counter++;
    }
}
