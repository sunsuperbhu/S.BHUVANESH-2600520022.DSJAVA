package com.pathfinder;

public class DoubleLinkedList {
	 DNode head;
	 DNode tail;
     public void add(String place){
     	DNode newNode = new DNode(place);
     	if (head == null) {
     		head = newNode;
     		tail = newNode;
     	}
     	else {
     		tail.next = newNode;
     		newNode.prev = tail;
     		tail = newNode;
     	}
     }
     public void displayForward() {
     	DNode temp = head;
     	while(temp != null) {
     		System.out.println(temp.data);
     		temp = temp.next;
     	}
     }
     public void displayBackward() {
      	DNode temp = tail;
      	while(temp != null) {
      		System.out.println(temp.data);
      		temp = temp.prev;
      	}
     }
}