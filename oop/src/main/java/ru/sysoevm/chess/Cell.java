package ru.sysoevm.chess;

/**
 * Класс Cell - содержит координаты по которым определенная фигура может делать ход
 */
public class Cell {
    private int x;
    private int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
