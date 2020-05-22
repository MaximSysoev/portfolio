package ru.sysoevm.simpleset;
import ru.sysoevm.simplearray.SimpleArray;

public class SimpleSet<E> {

    public SimpleArray<E> simpleArray;
    private int index = 0;

    public SimpleSet() {
        this.simpleArray = new SimpleArray<>();
    }

    public boolean contains(E value) {
        boolean result = false;
        for (E element : simpleArray.arrayList) {
            if (value == element) {
                result = true;
                break;
            }
        }
        return result;
    }


    public void add(E value) {
        if (!contains(value)) {
            simpleArray.add(value);
        }
    }
}
