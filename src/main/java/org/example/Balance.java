package org.example;

public class Balance {
    private float leftScale;
    private float rightScale;

    public Balance() {
        this.leftScale = 0;
        this.rightScale = 0;
    }

    public void addLeft(float weight) {
        this.leftScale += weight;
    }

    public void addRight(float weight) {
        this.rightScale += weight;
    }

    public String getResult() {
        if (this.leftScale == this.rightScale) return "=";
        return this.leftScale > this.rightScale ? "L" : "R";
    }
}
