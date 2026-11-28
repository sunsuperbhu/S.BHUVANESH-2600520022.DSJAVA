package com.pathfinder;
public class SingleLinkedList {
        Node head;
        public void add(String place){
        	Node newNode = new Node(place);
        	if (head == null) {
        		head = newNode;
        		return;
        	}
        	Node temp = head;
        	while(temp.next != null) {
        		temp = temp.next;
        	}
        	temp.next = newNode;
        }
        public void display() {
        	Node temp = head;
        	while(temp != null) {
        		System.out.println(temp.data);
        		temp = temp.next;
        	}
        }
        public void search(String key) {
        	Node temp = head;
        	int pos = 1;
        	while(temp != null) {
        		if (temp.data.equalsIgnoreCase(key)) {
        			System.out.println("Place found at position"+ pos);
        			return;
        			
        		}
        		temp = temp.next;
        		pos++;
        	}
        	System.out.println("place not found");
        }
    }

