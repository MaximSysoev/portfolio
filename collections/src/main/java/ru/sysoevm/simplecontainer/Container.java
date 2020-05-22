package ru.sysoevm.simplecontainer;

public interface Container<E> {
    void add(E value);
    E get(int index);
}
