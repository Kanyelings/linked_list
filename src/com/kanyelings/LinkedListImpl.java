package com.kanyelings;

import java.util.Arrays;

// Linked list class
// corrections
public class LinkedListImpl implements ILinkedList{
    // initializing properties
    private int size = 0;       // restricted access

    // Getter
    public int getSize() {
        return size;
    }

    Node head;
    Node tail;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {   // returns tre if the list is empty, and false if otherwise
        return(size == 0); // Returns true if size is 0
    }

    @Override
    public String first() {    // returns the first element in the list
        return null;
    }

    @Override
    public String last() {   // returns the last element in the list
        return null;
    }

    // update methods
    @Override
    public void addFirst(String data) {  //adds a new element to the front of the list
        Node node = new Node(); // Creates Node class object
        node.data = data;   // assigns the argument to the data of the node

        if ((head != null)) //Condition to assign the next value
            node.next = head;

        head = node;    //Assigns the node as the head
        size ++ ;   //Increments the size of the list
    }

    @Override
    public void addLast(String data) {
        Node node= new Node(); //creates method for new node

        if(isEmpty())
            head = tail = node;

        else
            node.next = null;
        tail.next = node;
        tail = node;

        last.data = data;   // sets its value to data
        Node node = head;   //sets head of list to node

        if(isEmpty())
            head = tail = last; //First node in list becomes first and last node
        else
            while(node.next != null) // Iterates through the initial list to find the node whose next value is null(The last node)
                node.next = tail;

            node.next = last;   // Sets the initial last node's next value to new node
            //last.next = null;   // Sets the new node's next value to null
            size++; // increments the size of the list
    }

    @Override
    public String removeFirst() {
        return null;
    }


    @Override
    public void show() {
        Node node = head;
        String[] listShow = new String[size()];
        int i = 0;
        while (node != null){
            listShow[i] = node.data;
            node = node.next;
            i++;
        }
        System.out.println(Arrays.toString(listShow));
    }
}
