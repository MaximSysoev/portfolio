package ru.sysoevm.store;

import ru.sysoevm.simplearray.SimpleArray;

/**
 * Класс RoleStore - храынилище для моделей Role
 */
public class RoleStore extends AbstractStore<Role> {

    public RoleStore() {
        super(new SimpleArray<>());
    }
}
