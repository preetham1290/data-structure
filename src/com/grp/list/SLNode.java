package com.grp.list;

public class SLNode<T> {
	private T data;
	private SLNode<T> next;

	public SLNode(T data) {
		super();
		this.data = data;
	}

	public SLNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public SLNode<T> getNext() {
		return next;
	}

	public void setNext(SLNode<T> next) {
		this.next = next;
	}

}
