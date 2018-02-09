package com.grp.list;

public interface List<T> {
	public void insertFisrt(T data);

	public void insertLast(T data);

	public void deleteFirst();

	public void deleteLast();

	public T get(int index);

	public int size();
	
	public void print();
}
