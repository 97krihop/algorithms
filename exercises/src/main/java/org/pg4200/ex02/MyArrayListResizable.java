package org.pg4200.ex02;

import org.pg4200.les02.list.MyArrayList;

public class MyArrayListResizable<T> extends MyArrayList<T> {

	public MyArrayListResizable() {
		super();
	}

	public MyArrayListResizable(int capacity) {
		super(capacity);
	}

	@Override
	public void add(int index, T value) {
		if (size == data.length) {
			Object[] big = new Object[data.length * 2];
			for (int i = 0; i < data.length; i++) {
				big[i] = data[i];
			}
			data = big;
		}

		super.add(index, value);
	}
}