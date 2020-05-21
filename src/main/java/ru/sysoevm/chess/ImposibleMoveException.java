package ru.sysoevm.chess;

public class ImposibleMoveException extends RuntimeException {
    public ImposibleMoveException(String msg) {
        System.out.println(msg);
    }
}
