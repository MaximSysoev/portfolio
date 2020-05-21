package ru.sysoevm.converter;

/**
 * Package for work surrender.
 *
 * @author Maxim Sysoev (mailto:time_amf@mail.ru)
 * @version $Id$
 * @since 0.1
 */

/*
Реализовать класс с методом Iterator<Integer> convert(Iterator<Iterator<Integer>> it).
Что из себя представляет запись Iterator<Iterator<Integer>?.
Каждый итератор это последовательность.
Итератор 1 – 4 2 0 4 6 4 9
Итератор 2 – 0 9 8 7 5
Итератор 3 – 1 3 5 6 7 0 9 8 4
Если мы говорим о записи Итератор Итераторов. Значит итератор содержит не конечные значения, а сложенные итераторы.
Итератор - Итератор 1, Итератор 2, Итератор 3.
Метод convert должен принимать объект итератор итератор и возвращать Итератор чисел.
Iterator<Iterator<Integer> - ((4 2 0 4 6 4 9), (0 9 8 7 5), (1 3 5 6 7 0 9 8 4))
Метод должен возвращать
Iterator<Integer> - (4 2 0 4 6 4 9 0 9 8 7 5 1 3 5 6 7 0 9 8 4)
* */