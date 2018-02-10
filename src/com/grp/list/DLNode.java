package com.grp.list;

public class DLNode<T> {

	private T data;
	private DLNode<T> next;
	private DLNode<T> previous;

	public DLNode(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DLNode<T> getNext() {
		return next;
	}

	public void setNext(DLNode<T> next) {
		this.next = next;
	}

	public DLNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DLNode<T> previous) {
		this.previous = previous;
	};

}
