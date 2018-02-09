package com.grp.list;

public interface List<T> {
	public void insertFisrt(T data);

	public void insertLast(T data);

	void insertAt(int index, T data);

	public void deleteFirst();

	public void deleteLast();

	void deleteAt(int index);

	public T get(int index);

	public int size();

	public void print();

}
