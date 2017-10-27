package com.atuldwivedi.dsa.ds.linkedlist.singly;

import com.atuldwivedi.dsa.ds.linkedlist.singly.LinkedList.Node;

public class CreateSinglyLinkedList {
	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		Node node = linkedList.add(20);
		linkedList.push(1);
		linkedList.insertAfter(node, 40);
		linkedList.append(50);
		linkedList.sortedInsert(25);
		linkedList.printList();
	}
}
