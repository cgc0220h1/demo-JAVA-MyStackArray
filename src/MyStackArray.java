public class MyStackArray<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int size;
    private E[] elements;
    private int topPointer;
    private int rearPointer;

    public MyStackArray(int capacity) {
        this.capacity = capacity;
        elements = (E[]) new  Object[capacity];
    }

    public MyStackArray() {
        this.capacity = DEFAULT_CAPACITY;
        elements = (E[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public int getRearPointerPosition() {
        return rearPointer;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (size == capacity) {
            return true;
        }
        return false;
    }

    public boolean push(E data) {
        if (isFull()) {
            return false;
        }
        if (!isEmpty()) {
            rearPointer++;
        }
        elements[rearPointer] = data;
        size++;
        return true;
    }

    public E pop() {
        if (isEmpty()) {
            rearPointer = topPointer;
            return null;
        }
        E value = elements[rearPointer];
        elements[rearPointer--] = null;
        return value;
    }
}
