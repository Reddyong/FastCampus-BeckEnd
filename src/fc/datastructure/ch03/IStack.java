package fc.datastructure.ch03;

public interface IStack<T> {
    void push(T data);

    T pop();

    T peek();

    int size();
}
