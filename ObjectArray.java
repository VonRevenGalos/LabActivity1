package _1_Exercises;

public class ObjectArray<T> {
    private T[] array;
    private int size;

    // Constructor
    public ObjectArray() {
        array = (T[]) new Object[10]; // Initial capacity of 10
        size = 0;
    }

    // Adds an element to the end of the array
    public void add(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    // Inserts an element at a specified index, shifting elements as needed
    public void insert(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity();
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    // Removes the element at the specified index, shifting elements as needed
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T removedElement = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null; // Help GC
        size--;
        return removedElement;
    }

    // Returns the element at the specified index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    // Returns the number of elements in the array
    public int size() {
        return size;
    }

    // Returns true if the array is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Ensures there is enough capacity in the array
    private void ensureCapacity() {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }
}

