package com.grp.list;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	List<Integer> list = new SLList<>();

	private void insertFirst() {
		System.out.println("Enter integer value to insert first");
		list.insertFisrt(sc.nextInt());
	}

	private void insertLast() {
		System.out.println("Enter integer value to insert last");
		list.insertLast(sc.nextInt());
	}

	private void deleteFirst() {
		list.deleteFirst();
	}

	private void deleteLast() {
		list.deleteLast();
	}

	private void getByIndex() {
		System.out.println("Enter index value to get");
		System.out.println("object is : " + list.get(sc.nextInt()));
	}

	private void getSize() {
		System.out.println("Size of list is : " + list.size());
	}

	private void print() {
		list.print();
	}

	public static void main(String[] args) {
		Main main = new Main();
		while (true) {
			System.out.println("1. For insert first\n2. For insert last\n3. For delete first\n4."
					+ " For delete last\n5. For get by index\n6. For size\n7. Print all data\n8. Any key to exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				main.insertFirst();
				break;
			case 2:
				main.insertLast();
				break;
			case 3:
				main.deleteFirst();
				break;
			case 4:
				main.deleteLast();
				break;
			case 5:
				main.getByIndex();
				break;
			case 6:
				main.getSize();
				break;
			case 7:
				main.print();
				break;
			default:
				System.exit(0);
			}
		}
	}

}
