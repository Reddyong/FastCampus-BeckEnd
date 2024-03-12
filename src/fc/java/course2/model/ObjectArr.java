package fc.java.course2.model;

import java.util.Arrays;

public class ObjectArr<T> {
    private T[] array;

    public ObjectArr(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }

    @Override
    public String toString() {
        return "ObjectArr{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
