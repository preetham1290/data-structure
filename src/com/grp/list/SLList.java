package com.grp.list;

public class SLList<T> implements List<T> {

	private SLNode<T> head;
	private int size = 0;

	@Override
	public void insertFisrt(T data) {
		SLNode<T> node = new SLNode<>(data);
		if (head == null) {
			head = node;
		} else {
			SLNode<T> temp = head;
			head = node;
			node.setNext(temp);
		}
		size++;
	}

	@Override
	public void insertLast(T data) {
		SLNode<T> node = new SLNode<>(data);
		if (head == null) {
			head = node;
		} else {
			SLNode<T> current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
		}
		size++;
	}

	@Override
	public void deleteFirst() {
		if (head == null) {
			return;
		} else {
			head = head.getNext();
		}
		size--;
	}

	@Override
	public void deleteLast() {
		if (head == null) {
			return;
		}
		SLNode<T> current;
		SLNode<T> ahead = head;
		do {
			current = ahead;
			ahead = ahead.getNext();
		} while (ahead != null && ahead.getNext() != null);
		current.setNext(null);
		size--;
	}

	@Override
	public T get(int index) {
		if (index >= size - 1) {
			int i = -1;
			SLNode<T> current = head;
			while (current != null) {
				i++;
				if (i == index) {
					return current.getData();
				} else {
					current = current.getNext();
				}
			}
		}
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void print() {
		SLNode<T> current = head;
		while (current != null) {
			System.out.print(current.getData() + "\t");
			current = current.getNext();
		}
	}

}
