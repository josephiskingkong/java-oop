package org.example;

public class Table {
    private int[][] table;

    public Table(int rows, int columns) {
        this.table = new int[rows][columns];
    }

    public void setValue(int row, int column, int value) {
        if (row > this.rows() - 1 || column > this.columns() - 1) {
            throw new IllegalArgumentException("Out of range");
        }

        this.table[row][column] = value;
    }

    public int getValue(int row, int column) {
        return this.table[row][column];
    }

    public int rows() {
        return this.table.length;
    }

    public int columns() {
        return this.table[0].length;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.rows(); i++) {
            for (int j = 0; j < this.columns(); j++) {
                builder.append(this.table[i][j]);
                if (j < this.columns() - 1) {
                    builder.append(" ");
                }
            }
            builder.append("\n");
        }

        if (builder.length() > 0 && builder.charAt(builder.length() - 1) == '\n') {
            builder.deleteCharAt(builder.length() - 1);
        }

        return builder.toString();
    }

    public int average() {
        int counter = 0;
        for (int i = 0; i < this.rows(); i++) {
            for (int j = 0; j < this.columns(); j++) {
                counter += this.table[i][j];
            }
        }

        return counter / (this.rows() * this.columns());
    }
}
