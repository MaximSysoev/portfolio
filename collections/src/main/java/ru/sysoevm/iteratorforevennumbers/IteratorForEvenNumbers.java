package ru.sysoevm.iteratorforevennumbers;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorForEvenNumbers implements Iterator {
    private int[] numbers;
    private int index = 0;
    private int hasIndex = 0;
    public IteratorForEvenNumbers(final int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        if (index!=numbers.length-1) {
            hasIndex = index + 1;
        } else {
            hasIndex = index;
        }

        return numbers.length > hasIndex && numbers[hasIndex] % 2 == 0;
    }

    @Override
    public Object next() throws NoSuchElementException {
        int result = 0;
        if (index < numbers.length) {
            for (int i = index; i < numbers.length; i++) {
                if (index == numbers.length - 1 & numbers[index] % 2 != 0) {
                    throw new NoSuchElementException();
                }
                if (numbers[i] % 2 == 0) {
                    index = i + 1;
                    result = numbers[i];
                    break;
                }
            }
        } else {
            throw new NoSuchElementException();
        }
        return result;
    }
}
