package org.example;

import Exceptions.InvalidGeometryException;
import Exceptions.SizeException;
import geometry2d.Circle;
import geometry3d.Cylinder;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void click() {
        Button button = new Button();
        for (int i = 0; i < 66; i++) {
            button.click();
        }
        assertEquals(66, button.getClicks());
    }

    @Test
    void balances() {
       Balance scale = new Balance();
       scale.addLeft(100);
       scale.addRight(99);
       assertEquals("L", scale.getResult());
    }

    @Test
    void sound() {
        Bell bell = new Bell();
        assertEquals("ding", bell.getSound());
        bell.sound();
        assertEquals("dong", bell.getSound());
    }

    @Test
    void separator() {
        OddEvenSeparator separator = new OddEvenSeparator();
        for (int i = 0; i < 10; i++) {
            separator.addNumber(i);
        }
        List<Integer> expected = Arrays.asList(1, 3, 5, 7, 9);
        assertEquals(expected, separator.odd());
        expected = Arrays.asList(0, 2, 4, 6, 8);
        assertEquals(expected, separator.even());
    }

    @Test
    void table() {
        Table table = new Table(3, 3);
        table.setValue(0, 1, 3);
        table.setValue(2, 0, 15);
        assertEquals(2, table.average());
        assertEquals("0 3 0\n" + "0 0 0\n" + "15 0 0", table.toString());
    }

    @Test
    void circle() throws SizeException {
        Circle circle = new Circle(3);
        assertEquals(28.2743, circle.area(), 4);
    }

    @Test
    void cylinder() throws SizeException, InvalidGeometryException {
        Circle circle = new Circle(3);
        Cylinder cylinder = new Cylinder(circle, 4);
        assertEquals(113.0973, cylinder.volume(), 4);
    }
}