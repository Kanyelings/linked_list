package com.kanyelings;

public class LinkedListImpl implements ILinkedList{
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	Node head;

	@Override
    // access methods
    public int size() { // returns the number of elements in the list
        int size=0;
        Node headNode = this.head;
    	while(headNode!=null) {
        	size+=1;
        	headNode=headNode.next;
        }
    	return size;
    }

    @Override
    public boolean isEmpty() {   // returns true if the list is empty, and false if otherwise
        return !(this.size()>0);
    }

    @Override
    public String first() {    // returns the first element in the list
    	if(this.head==null) {
    		return null;
    	}
    	return Integer.valueOf(this.head.data).toString();
    }

    @Override
    public String last() {   // returns the last element in the list
    	if(this.head==null) {
    		return null;
    	}
        Node node = this.head;
        while(node.next!=null) {
        	node=node.next;
        }
        return Integer.valueOf(node.data).toString();
    }

    // update methods
    @Override
    public void addFirst(int data) {  //adds a new element to the front of the list
    	Node node = new Node(data);
    	node.next=this.head;
    	this.head=node;
    }

    @Override
    public void addLast(int data) {  // adds a new element to the end of the list
    	Node nodeToAdd = new Node(data);
    	if(this.head==null) {
    		this.head=nodeToAdd;
    		return;
    	}
    	Node node = this.head;
        while(node.next!=null) {
        	node=node.next;
        }
        node.next=nodeToAdd;
    }

    @Override
    public String remove() {  // removes and returns the first element of the list
    	if(this.head==null) {
    		return null;
    	}
        Node firstNode = this.head;
        this.head=firstNode.next;
        firstNode.next=null;
        return Integer.valueOf(firstNode.data).toString();
    }
}
