package ru.sysoevm.menu;

import java.util.List;

public interface Menu<E>{
    Node<E> getNode(String id, String value, List<Node<E>> list);
    void add(String id, String value);
    void load();
}

