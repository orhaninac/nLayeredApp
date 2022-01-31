package nLayeredApp.core.ArrayList;

import java.util.Arrays;

public class MyArrayList<T> {
	private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[]=new Object[10];
    

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void newArray() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

	public boolean add(T e) {
        if (size == elements.length) {
            newArray();
        }
        elements[size++] = e;
		return true;
	}
	
	public int size() {
		return size;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T) elements[index];
	}
	
	public void set(int index , T element)	{
		elements[index] = element;		
	}
	
	public int indexOf(T element) {
		int index = 0;
		for(index = 0; index < size; index++) {
			if(elements[index]==element) {
				return index;
			}
		}
		return -1;
	}
	
	public boolean contains(T entity) {
		for (int i = 0; i < size-1; i++) {
			if (elements[i] == entity) {
				return true;
			}
		}
		return false;
	}
		
	public void remove(T element) {
		int index = this.indexOf(element);
	    if (index < 0 || index >= this.size) {
	        // FYI, this would be thrown anyway; not sure if you need to do it
	        throw new IndexOutOfBoundsException("Index out of bounds.");
	    }
	    Object[] temp = new Object[this.size - 1];
	    for(int i = 0, j = 0; i < this.size; i++){
	    	if (i != index) {
	            temp[j++] = this.elements[i];
	        }
	        // otherwise, j does not get incremented
	    }
	    this.elements = temp; // don't forget this!
	}
	   
	
	public void getAll() {
		for (int i = 0; i < size-1; i++) {
			System.out.println(elements[i]);
		}
	}

}
