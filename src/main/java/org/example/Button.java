package org.example;

public class Button {
    private int counter;

    public Button() {
        this.counter = 0;
    }

    public void click() {
        this.counter++;
    }

    public int getClicks() {
        return this.counter;
    }
}