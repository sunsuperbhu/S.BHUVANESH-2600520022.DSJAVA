package com.pathfinder;
import java.util.ArrayList;
import java.util.Scanner;
public class PlaceCatalog {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//displaying using print
;		System.out.println("=====CAMPUS PLACE CATALOG=====");
		System.out.println("Library");
		System.out.println("Canteen");
		System.out.println("Computer Lab");
		System.out.println("Auditorium");
		System.out.println("Admin Block");
		// using arrays
		String[] places = {"Library","Canteen","Computer Lab","Auditorium","Admin Block"};
		System.out.println("=====CAMPUS PLACES=====");
		for (int i=0;i<places.length;i++){
			System.out.println(places[i]);
		}
		//using array list
		ArrayList<String> places1 = new ArrayList<>();
		System.out.println("=====CAMPUS PLACE CATALOG=====");
		places1.add("Library");
		places1.add("Canteen");
		places1.add("Computer Lab");
		places1.add("Auditorium");
		places1.add("Admin Block");
		for (int i =0;i<places1.size();i++) {
			System.out.println(places1.get(i));
		}
		//searching for a place on array list
		System.out.println("========================");
		System.out.println("Enter place to search");
		String key = sc.nextLine();
		boolean found = false;
		for (int i =0;i<places1.size();i++) {
			if(places1.get(i).equalsIgnoreCase(key)) {
			System.out.println("Place found at position : " + (i + 1));
			found = true;
			break;
			}
		}
		if(found == false) {
			System.out.println("Place not found");
		}
		sc.close();

	}

}
