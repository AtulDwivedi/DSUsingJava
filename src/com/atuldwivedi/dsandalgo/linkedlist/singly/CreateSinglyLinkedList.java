package com.atuldwivedi.dsandalgo.linkedlist.singly;

public class CreateSinglyLinkedList {
	public static void main(String[] args) {

		Node head = createSinglyLinkedList();

		traversSinglyLinkedList(head);

	}

	private static void traversSinglyLinkedList(Node head) {
		if(head != null){
			Node node = head;
			while(node != null){
				System.out.println(node.data);
				node = node.next;
			}
		}
		
	}

	private static Node createSinglyLinkedList() {
		
		Node firstN = new Node(10);
		Node secondN = new Node(20);
		Node thirdN = new Node(30);

		Node head = firstN;
		firstN.next = secondN;
		secondN.next = thirdN;
		thirdN.next = null;
		return head;
	}

}
