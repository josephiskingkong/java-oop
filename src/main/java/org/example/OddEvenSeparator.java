package org.example;

import java.util.ArrayList;

public class OddEvenSeparator {
    private final ArrayList<Integer> oddArray;
    private final ArrayList<Integer> evenArray;

    public OddEvenSeparator() {
        this.oddArray = new ArrayList<Integer>();
        this.evenArray = new ArrayList<Integer>();
    }

    public void addNumber(int number) {
        if (number % 2 == 0) this.evenArray.add(number);
        else this.oddArray.add(number);
    }

    public ArrayList<Integer> odd() {
        return this.oddArray;
    }

    public ArrayList<Integer> even() {
        return this.evenArray;
    }
}
