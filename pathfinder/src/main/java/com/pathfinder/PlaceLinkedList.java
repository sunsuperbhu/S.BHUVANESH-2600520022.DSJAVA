package com.pathfinder;

public class PlaceLinkedList {
	Node head;
	void add(String place) {
		Node newNode = new Node(place);
		
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
