package ru.sysoevm.simplestack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Container<E> implements Iterable<E>{
    public Node<E> head;
    public Node<E> tail;

    public void add(E value) {
        Node<E> newNode = new Node<>(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new SimpleIterator();
    }

    class SimpleIterator implements Iterator<E> {

        public Node<E> temp = head;

        @Override
        public boolean hasNext() {
            return temp != null;
        }

        @Override
        public E next() {
            E value = null;
            if (hasNext()) {
                value = (E) temp.value;
                temp = temp.next;
            } else {
                throw new NoSuchElementException();
            }
            return value;
        }
    }
}
