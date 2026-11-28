package com.pathfinder;
public class DNode {
	String data;
	DNode prev;
	DNode next;
	DNode(String data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}

}
