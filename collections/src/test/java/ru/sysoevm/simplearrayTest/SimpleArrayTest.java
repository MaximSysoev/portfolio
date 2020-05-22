package ru.sysoevm.simplearrayTest;

import org.junit.Before;
import org.junit.Test;
import ru.sysoevm.simplearray.SimpleArray;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SimpleArrayTest {

    private ArrayList<Integer> arrayList = new ArrayList<>();
    private SimpleArray simpleArray = new SimpleArray();

    @Before
    public void setUp() {
        simpleArray.add(1);
        simpleArray.add(2);
        simpleArray.add(3);
        simpleArray.set(2, 5);
    }

    /**
     * Добавление новых значений
     */
    @Test
    public void whenAddNewValue() {
        assertThat(1, is(simpleArray.get(0)));
    }

    /**
     * Получение значения по индексу
     */
    @Test
    public void whenGetValue() {
        assertThat(5, is(simpleArray.get(2)));
    }

    /**
     * Удаление значения
     */
    @Test
    public void whenDeleteValue() {
        simpleArray.delete(1);
        assertThat(3, is(simpleArray.get(2)));
    }

    /**
     * Получение следующего значения при помощи итератора
     */
    @Test
    public void whenNextValue() {
        assertThat(1, is(simpleArray.iterator().next()));
    }
}
