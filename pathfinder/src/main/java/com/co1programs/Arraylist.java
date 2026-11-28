package com.co1programs;
import java.util.ArrayList;
public class Arraylist {
	public static void main(String args[]) {
		// Create an ArrayList
        ArrayList<String> subjects = new ArrayList<>();

        // Adding five subjects
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("DBMS");
        subjects.add("Operating Systems");
        subjects.add("Computer Networks");

        // Display all subjects
        System.out.println("Total Subjects Entered:");
        System.out.println(subjects);
        System.out.println("Total Subjects: " + subjects.size());
        // Remove one subject
        subjects.remove("DBMS");

        // Display after removing
        System.out.println("After Removing DBMS:");
        System.out.println(subjects);
        System.out.println("Total Subjects: " + subjects.size());
        
        // Add another subject
        subjects.add("Software Engineering");
        subjects.add("Design and Analysis of Algorithms");

        System.out.println("After Adding Software Engineering:");
        System.out.println(subjects);
        // Display total number of subjects
        System.out.println("Total Subjects: " + subjects.size());
	}

}
// Hello I am good and also doing very fine and today is  the first day of my work