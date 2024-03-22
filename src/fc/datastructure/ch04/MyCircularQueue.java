package fc.datastructure.ch04;

public class MyCircularQueue<T> implements IQueue<T> {
    private T[] elements;
    private int front;
    private int rear;
    private int maxSize;

    public MyCircularQueue(int size) {
        this.elements = (T[]) new Object[size + 1];
        this.front = 0;
        this.rear = 0;
        this.maxSize = size + 1;
    }

    @Override
    public void offer(T data) {
        if (this.isFull()) {
            throw new IllegalStateException();
        }

        this.rear = (this.rear + 1) % this.maxSize;
        this.elements[this.rear] = data;
    }

    @Override
    public T poll() {
        if (this.isEmpty()) {
            throw new IllegalStateException();
        }

        this.front = (this.front + 1) % this.maxSize;

        return this.elements[front];
    }

    @Override
    public T peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException();
        }

        return this.elements[(this.front + 1) % this.maxSize];
    }

    @Override
    public int size() {
        if (this.rear >= this.front) {
            return this.rear - this.front;
        }
        return this.maxSize - this.front + this.rear;
    }

    @Override
    public void clear() {
        this.front = 0;
        this.rear = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.front == this.rear;
    }

    public boolean isFull() {
        return (this.rear + 1) % this.maxSize == this.front;
    }
}