package ru.sysoevm.simplestack;

import ru.sysoevm.simplecontainer.SimpleContainer;

public class SimpleStack<E> {

    private Container<E> container = new Container<>();
    private SimpleContainer<E> simpleContainer = new SimpleContainer<>();
    private int index = 0;

    public Container<E> getContainer() {
        return container;
    }

    public SimpleContainer<E> getSimpleContainer() {
        return simpleContainer;
    }

    /**
     * Возвращает значение и удаляет его из позиции.
     * @return null.
     */

    public void poll() {
        E value = (E) simpleContainer.get(index);
        simpleContainer.remove(index);
        index++;
    }


    /**
     * Добавляет в SimpleContainer связанный список
     * @param value
     */
    public void push(E value) {
        container.add(value);
        simpleContainer.add(container.head.value);
        container.head = container.head.next;
    }

}
