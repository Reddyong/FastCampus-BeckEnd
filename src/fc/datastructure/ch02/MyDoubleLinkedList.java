package fc.datastructure.ch02;

public class MyDoubleLinkedList<T> implements IList<T> {
    private int size;
    private Node head;
    private Node tail;

    public MyDoubleLinkedList() {
        this.size = 0;
        this.head = new Node(null);
        this.tail = new Node(null);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    @Override
    public void add(T t) {
        Node prev = this.tail.prev;
        Node node = new Node(t, prev, this.tail);

        prev.next = node;
        this.tail.prev = node;
        this.size++;
    }

    @Override
    public void insert(int index, T t) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }

        int tempSize = this.size / 2;
        int i = 0;
        Node prev = new Node();
        Node curr = new Node();

        if (index <= tempSize) {
            prev = this.head;
            curr = prev.next;
            while (i++ < index) {
                prev = prev.next;
                curr = curr.next;
            }
        }

        if (index > tempSize) {
            curr = this.tail;
            prev = curr.prev;
            while (i++ < (this.size - index)) {
                prev = prev.prev;
                curr = curr.prev;
            }
        }

        Node node = new Node(t, prev, curr);
        prev.next = node;
        curr.prev = node;
        this.size++;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    @Override
    public boolean delete(T t) {
        Node prev = this.head;
        Node curr = prev.next;
        Node next = curr.next;

        while (curr != this.tail) {
            if (curr.data.equals(t)) {
                prev.next = next;
                curr.next = null;
                curr.prev = null;
                next.prev = prev;
                this.size--;
                return true;
            }
            prev = prev.next;
            curr = curr.next;
            next = next.next;
        }
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }

        int tempSize = this.size / 2;
        int i = 0;
        Node prev = new Node();
        Node curr = new Node();
        Node next = new Node();

        if (index <= tempSize) {
            prev = this.head;
            curr = prev.next;
            next = curr.next;

            while (i++ < index) {
                prev = prev.next;
                curr = curr.next;
                next = next.next;
            }
        }
        if (index > tempSize) {
            next = this.tail;
            curr = next.prev;
            prev = curr.prev;

            while (i++ < (this.size - index - 1)) {
                next = next.prev;
                curr = curr.prev;
                prev = prev.prev;
            }
        }

        curr.prev = null;
        curr.next = null;
        prev.next = next;
        next.prev = prev;
        this.size--;

        return true;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }

        int i = 0;
        int tempSize = this.size / 2;
        Node curr = new Node();

        if (index <= tempSize) {
            curr = this.head.next;

            while (i++ < index) {
                curr = curr.next;
            }
        }
        if (index > tempSize) {
            curr = this.tail.prev;

            while (i++ < (this.size - index - 1)) {
                curr = curr.prev;
            }
        }

        return curr.data;
    }

    @Override
    public int indexOf(T t) {
        Node curr1 = this.head.next;
        Node curr2 = this.tail.prev;
        int index1 = 0;
        int index2 = this.size - 1;

        while (curr1 != this.tail || curr2 != this.head) {
            if (t.equals(curr1.data)) {
                return index1;
            }

            if (t.equals(curr2.data)) {
                return index2;
            }

            curr1 = curr1.next;
            curr2 = curr2.prev;
            index1++;
            index2--;
        }

        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.head.next == this.tail;
    }

    @Override
    public boolean contains(T t) {
        Node curr1 = this.head.next;
        Node curr2 = this.tail.prev;

        while (curr1 != this.tail || curr2 != this.head) {
            if (t.equals(curr1.data) || t.equals(curr2.data)) {
                return true;
            }

            curr1 = curr1.next;
            curr2 = curr2.prev;
        }

        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    private class Node {
        T data;
        Node prev;
        Node next;

        public Node() {
        }

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

}
