package fc.java.course2.model;

import java.util.Arrays;

public class ObjectArray {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size = 0;

    public ObjectArray() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위 초과");
        }

        return elements[index];
    }

    public void add(Object object) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = object;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;

        elements = Arrays.copyOf(elements, newCapacity);
    }
}
