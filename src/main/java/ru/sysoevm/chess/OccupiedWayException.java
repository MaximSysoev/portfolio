package ru.sysoevm.chess;

public class OccupiedWayException extends RuntimeException {
    public OccupiedWayException(String msg) {
        System.out.println(msg);
    }
}
