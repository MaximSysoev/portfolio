package ru.sysoevm.chess;

public class FigureNotFoundException extends RuntimeException {
    public FigureNotFoundException(String msg) {
        System.out.println(msg);
    }
}
