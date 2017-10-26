package com.atuldwivedi.dsandalgo.linkedlist.singly;

public class LinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public Node add(int data) {
		Node pos = head;
		if (pos == null) {
			pos = new Node(data);
			head = pos;
		} else {
			while (pos.next != null) {
				pos = pos.next;
			}
			pos.next = new Node(data);
		}
		return pos.next;
	}

	public void printList() {
		Node pos = head;
		if (pos != null) {
			while (pos != null) {
				System.out.print(pos.data + " => ");
				pos = pos.next;
			}
		}
		System.out.print("null");
	}

	public void push(int data) {
		Node newNode = new Node(data);

		newNode.next = head;
		head = newNode;
	}

	public void insertAfter(Node prevNode, int data) {

		if (prevNode == null) {
			return;
		}
		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}
}
