package com.kanyelings;

public class LinkedListImpl implements ILinkedList{
    private int size = 0;   // size of the linked list and very secure
    Node head;      // points the head of the linked list
    Node tail;      // points the tail


    // Getter Method
    public int getSize() { // returns the number of elements in the list
        return size;
    }

    @Override
    public boolean isEmpty() {   // returns tre if the list is empty, and false if otherwise
        return false;
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
    public void addFirst(String data) {
        Node node = new Node();   // Create Node class object
        node.data = data;    // Assign the argument to the data of the node

        if (head != null)   // Condition to check if the exist atleast one node in the linked list
            node.next = head;   // Making the new node point to the head of the linked list
        else {
            tail = node;  // Assigning the new node to the tail
            tail.next = null;
        }
        head = node;   // Making the new node head of linked list
        size ++ ;   //Increment the size of the linked list

    }

    @Override
    public void addLast() {  // adds a new element to the end of the list

    }

    @Override
    public String remove() {  // removes and returns the first element of the list
        return null;
    }
}
