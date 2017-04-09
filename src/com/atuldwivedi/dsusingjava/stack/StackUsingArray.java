package com.atuldwivedi.dsusingjava.stack;

import java.util.Arrays;

public class StackUsingArray<E> {
	private int size;
	private static int DEFAULT_SIZE = 10;
	private Object[] stack;

	public StackUsingArray() {
		stack = new Object[DEFAULT_SIZE];
	}

	public E push(E e) {
		if (size == stack.length) {
			increaseStackSize();
		}
		stack[size++] = e;
		return e;
	}

	private void increaseStackSize() {
		int newSize = stack.length * 2;
		stack = Arrays.copyOf(stack, newSize);
	}

	public E pop() {
		E e = (E) stack[--size];
		stack[size] = null;
		return e;
	}

	public E peek() {
		return (E) stack[size];
	}

	public boolean empty() {
		boolean result = true;
		if (size > 0)
			result = false;
		return result;
	}

	public int search(E e) {
		int position = -1;
		for (int i = 0; i < stack.length; i++) {
			if ((E) stack[i] == e)
				position = i+1;
		}
		return position;
	}
}
