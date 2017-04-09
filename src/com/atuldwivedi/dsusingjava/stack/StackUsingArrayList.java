package com.atuldwivedi.dsusingjava.stack;

import java.util.ArrayList;

public class StackUsingArrayList<E> extends ArrayList<E> {

	public E push(E e) {
		add(e);
		return e;
	}

	public E pop() {
		if (size() <= 0)
			throw new RuntimeException("Nothing to pop");
		E e = get(size() - 1);
		remove(size() - 1);
		return e;
	}
}
