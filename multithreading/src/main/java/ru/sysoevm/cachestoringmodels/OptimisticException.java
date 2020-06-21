package ru.sysoevm.cachestoringmodels;

public class OptimisticException extends RuntimeException {
    private int version;
    public OptimisticException(String message) {
        System.out.println(message);
    }
}
