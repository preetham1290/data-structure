package com.grp.list;

public class DLList<T> implements List<T> {

	private DLNode<T> head;
	private int size = 0;

	@Override
	public void insertFisrt(T data) {
		DLNode<T> node = new DLNode<T>(data);
		if (head == null) {
			head = node;
		} else {
			node.setNext(head);
			node.getNext().setPrevious(node);
			head = node;
		}
		size++;
	}

	@Override
	public void insertLast(T data) {
		DLNode<T> node = new DLNode<T>(data);
		if (head == null) {
			head = node;
		} else {
			DLNode<T> current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			node.setPrevious(current);
			current.setNext(node);
		}
		size++;
	}

	@Override
	public void insertAt(int index, T data) {
		int count = -1;
		if (index > size) {
			return;
		}
		if (index == 0) {
			insertFisrt(data);
		} else if (index == size) {
			insertLast(data);
		} else {
			DLNode<T> node = new DLNode<T>(data);
			DLNode<T> current = head;
			while (current.getNext() != null) {
				count++;
				if (count == index - 1) {
					break;
				}
				current = current.getNext();
			}
			node.setNext(current.getNext());
			current.getNext().setPrevious(node);
			node.setPrevious(current);
			current.setNext(node);
		}
		size++;
	}

	@Override
	public void deleteFirst() {
		if (head != null) {
			if (head.getNext() == null) {
				head = null;
			} else {
				head = head.getNext();
				head.setPrevious(null);
			}
		}
		size--;
	}

	@Override
	public void deleteLast() {
		if (head != null) {
			DLNode<T> current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.getPrevious().setNext(null);
		}
		size--;
	}

	@Override
	public void deleteAt(int index) {
		int count = 0;
		if (index >= size) {
			return;
		}
		if (index == 0) {
			deleteFirst();
		} else if (index == size - 1) {
			deleteLast();
		} else {
			DLNode<T> current = head;
			while (current.getNext() != null) {
				count++;
				if (count == index - 1) {
					break;
				}
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
			current.getNext().getNext().setPrevious(current);
		}
		size--;
	}

	@Override
	public T get(int index) {
		if (size == 0 || index > size - 1) {
			return null;
		}
		if (index == 0) {
			return head.getData();
		}
		int count = 0;
		DLNode<T> current = head;
		while (current.getNext() != null) {
			count++;
			if (count == index) {
				return current.getData();
			}
			current = current.getNext();
		}
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void print() {
		if (head == null) {
			return;
		}
		DLNode<T> current = head;
		DLNode<T> previous = null;
		System.out.println("\nFirst to last");
		while (current != null) {
			System.out.print(current.getData() + "\t");
			previous = current;
			current = current.getNext();
		}
		System.out.println("\nReverse order");
		while (previous != null) {
			System.out.print(previous.getData() + "\t");
			previous = previous.getPrevious();
		}
	}

}
