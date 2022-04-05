package com.kanyelings;

public class LinkedListImpl implements ILinkedList{
    int size = 0;   // size of the linked list
    Node head;      // points the head of the linked list
    Node tail;      // points the tail

    @Override
    // access methods
    public int size() { // returns the number of elements in the list
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
    public void addFirst() {  //adds a new element to the front of the list

    }

    @Override
    public void addLast() {  // adds a new element to the end of the list

    }

    @Override
    public String remove() {  // removes and returns the first element of the list
        return null;
    }
}
