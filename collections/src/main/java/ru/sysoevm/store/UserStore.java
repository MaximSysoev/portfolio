package ru.sysoevm.store;

import ru.sysoevm.simplearray.SimpleArray;

/**
 * Класс UserStore - храынилище для моделей User
 */
public class UserStore extends AbstractStore<User> {
    public UserStore() {
        super(new SimpleArray<>());
    }
}
