package ru.sysoevm.simplearray;

/**
 * Package for work surrender.
 *
 * @author Maxim Sysoev (mailto:time_amf@mail.ru)
 * @version $Id$
 * @since 0.1
 */


/*
    В этом задании необходимо сделать универсальную обертку над массивом.
    Создать класс: public class SimpleArray<T>
    Добавить методы:
    add(T model) - добавляет указанный элемент (model) в первую свободную ячейку;
    set(int index, T model) - заменяет указанным элементом (model) элемент, находящийся по индексу index;
    remove(int index) - удаляет элемент по указанному индексу, все находящиеся справа элементы при этом необходимо сдвинуть на единицу влево (в середине массива не должно быть пустых ячеек);
    get(int index) - возвращает элемент, расположенный по указанному индексу;

    Также, реализуйте интерфейс Iterable<T> - метод iterator() возвращает итератор, предназначенный для обхода данной структуры.

    Объект должен принимать количество ячеек. Структура не должна быть динамической.
 */