package ru.sysoevm.simplecontainer;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleContainer<E> implements Container<E>, Iterable<E>  {

    private int index = 0;
    private int modCount = 0;
    private Object[] container = new Object[10];

    public Object[] ensureCapacity(Object[] source, int capacity) {
        return Arrays.copyOf(source, capacity);
    }


    public void remove(int index) throws NoSuchElementException {
        if (container[index]!=null) {
            container[index] = null;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void add(E value) {
        if (index > container.length - 1) {
            container = ensureCapacity(container, index + 10);
        }
        container[index] = value;
        index++;
        modCount++;
    }

    @Override
    public E get(int index) {
        return (E) container[index];
    }

    @Override
    public Iterator<E> iterator() {
        return new SimpleIterator<E>();
    }

    public class SimpleIterator<E> implements Iterator {
        private int expectedModCount = modCount;
        private int indexNext = 0;

        public void checkForConcurrentModification() throws ConcurrentModificationException, NoSuchElementException {
            if (expectedModCount != modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public boolean hasNext() {
            return indexNext < index;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            indexNext+=1;
            checkForConcurrentModification();
            return (E)container[indexNext];
        }
    }

}
