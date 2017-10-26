package com.atuldwivedi.dsandalgo.linkedlist.singly;

import com.atuldwivedi.dsandalgo.linkedlist.singly.LinkedList.Node;

public class CreateSinglyLinkedList {
	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		Node node = linkedList.add(20);
		linkedList.push(30);
		linkedList.insertAfter(node, 40);
		linkedList.append(50);
		linkedList.printList();
	}
}
