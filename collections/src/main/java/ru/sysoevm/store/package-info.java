package ru.sysoevm.store;

/**
 * Package for work surrender.
 *
 * @author Maxim Sysoev (mailto:time_amf@mail.ru)
 * @version $Id$
 * @since 0.1
 */

/*
    В этом задании необходимо реализовать контейнеры для хранения объектов. Структура контейнеров будет одинаковая
    Контейнеры должны быть описаны интерфейсом Store:

    public interface Store<T extends Base> {
        void add(T model);
        boolean replace(String id, T model);
        boolean delete(String id);
        T findById(String id);
    }


    Все модели наследуются от базовой модели Base

    public abstract class Base {
        final String id;
        protected Base(final String id) {
            this.id = id;
        }
        public String getId() {
            return id;
        }
    }



 */