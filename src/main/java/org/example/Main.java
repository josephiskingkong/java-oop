package org.example;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        for (int i = 0; i < 100; i++) {
            button.click();
        }
        System.out.println(button.getClicks());

        Balance balance = new Balance();
        balance.addLeft(100);
        balance.addRight(99);
        System.out.println(balance.getResult());

        Bell bell = new Bell();
        bell.sound();
        bell.sound();

        OddEvenSeparator separator = new OddEvenSeparator();
        for (int i = 0; i < 100; i++) {
            separator.addNumber(i);
        }
        System.out.println(separator.odd());
        System.out.println(separator.even());

        Table table = new Table(3, 3);
        table.setValue(0, 1, 3);
        table.setValue(2, 0, 15);
        System.out.println(table.toString());
        System.out.println(table.average());
    }
}