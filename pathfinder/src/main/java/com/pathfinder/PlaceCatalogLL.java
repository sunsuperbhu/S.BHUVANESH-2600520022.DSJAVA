package com.pathfinder;

public class PlaceCatalogLL {
	public static void main(String []args) {
		
		SingleLinkedList List = new SingleLinkedList();
		DoubleLinkedList List1 = new DoubleLinkedList();
		List.add("Library");
		List.add("Canteen");
		List.add("Computer Lab");
		List.add("Auditorium");
		List.add("Campus Places:");
		System.out.println("===========CAMPUS PLACES===========");
		List.display();
		System.out.println("Search results");
		
		List.search("canteen");
		List1.add("Library");
		List1.add("Canteen");
		List1.add("Computer Lab");
		List1.add("Auditorium");
		List1.add("Campus Places:");
		System.out.println("Forward direction");
		List1.displayForward();
		System.out.println("Backward dirction");
		List1.displayBackward();
	}

}


