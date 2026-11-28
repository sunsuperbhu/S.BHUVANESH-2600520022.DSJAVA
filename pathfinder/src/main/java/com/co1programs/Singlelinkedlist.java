package com.co1programs;

public class Singlelinkedlist {
	// Node class
    static class Node             //Defines a class named Node to create linked list nodes.
    {
        int data;                 //Stores the value of the node.
        Node next;                //Stores the reference (address) of the next node.
        
        Node(int data)           //Constructor used to initialize a new node.
        {
            this.data = data;   //Assigns the given value to the node's data variable.
            this.next = null;   //Initially, the node does not point to any other node.
        }
    }

    // Root reference
    static Node root = null;   //initially, the linked list is empty
    static void insert(int value)  //Defines a static method named insert() to insert a 
                                   //new node with the given value into the linked list.
    	    {
        Node temp = new Node(value);  //Creates a new node and stores the given value in it.
        if (root == null)       //Checks whether the linked list is empty (root is null).
        { 
            root = temp;    // If the list is empty, makes the new node the first node (root).
        }
        else
        {                //Executes when the linked list already contains nodes.
        	
            Node p = root;  //Creates a temporary reference named temp and starts
                               //from the first node (root).
            while (p.next != null)  //Checks whether the next node exists. 
            	                          //Repeats the loop until the last node is reached.
            {
                p = p.next;     //Moves the temporary reference to the next node.
            }
            p.next = temp;     //Connects the last node to the new node, 
                                     //inserting it at the end of the linked list.
        }
    }

    // 2. Insert at beginning
    static void insertAtBeginning(int value) 
    {
        Node temp = new Node(value);
        temp.next = root;
        root = temp;
    }
    // 3. Insert at specific position
    static void insertAtPosition(int value, int position)
    {
        if (position < 1) 
        {
            System.out.println("Invalid position");
            return;
        }
        Node temp = new Node(value);
        if (position == 1)
        {
            temp.next = root;
            root = temp;
            return;
        }
        Node p = root;
        for (int i = 1; i < position - 1 && p != null; i++) 
        {
            p = p.next;
        }
        if (p == null)
        {
            System.out.println("Invalid position");
            return;
        }
        temp.next = p.next;
        p.next = temp;
    }
    // 4. Delete first node
    static void deleteFirst()
    {
        if (root == null)
        {
            System.out.println("List is empty!");
        }
        else 
        {
            root = root.next;
            System.out.println("First node deleted.");
        }
    }
    // 5. Delete at specific position
    static void deleteAtPosition(int position) 
    {
        if (position < 1 || root == null) {
            System.out.println("Invalid position or empty list");
            return;
        }
        if (position == 1) 
        {
            root = root.next;
            return;
        }
        Node temp = root;
        for (int i = 1; i < position - 1 && temp != null; i++) 
        {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) 
        {
            System.out.println("Invalid position");
            return;
        }
        temp.next = temp.next.next;
    }

    // 6. Display linked list
    static void display() 
    {
        Node temp = root;
        System.out.print("List: ");
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main method
    public static void main(String[] args)
    {

        // Insert at end
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        System.out.println("Initial List:");
        display();

        // Insert at beginning
        insertAtBeginning(5);
        System.out.println("\nAfter inserting 5 at beginning:");
        display();

        // Insert at specific position hey i am good
        insertAtPosition(25, 3);
        System.out.println("\nAfter inserting 25 at position 3:");
        display();

        // Delete first node
        deleteFirst();
        System.out.println("\nAfter deleting first node:");
        display();

        // Delete at specific position
        deleteAtPosition(2);
        System.out.println("\nAfter deleting node at position 2:");
        display();
    }
}
