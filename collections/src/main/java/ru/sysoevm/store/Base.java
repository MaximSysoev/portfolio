package ru.sysoevm.store;

/**
 * Класс Base от которой наследуются все модели
 */
public abstract class Base {
    final String id;

    protected Base(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
