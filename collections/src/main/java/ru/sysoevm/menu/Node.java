package ru.sysoevm.menu;

import java.util.ArrayList;
import java.util.List;

public class Node<E> {
    String id;
    String value;
    List<Node<E>> list;

    public Node (String id, String value) {
        this.id = id;
        this.value = value;
        this.list = new ArrayList<>();
    }

    public List<Node<E>> getList() {
        return list;
    }

    public String getValue() {
        return value;
    }
}