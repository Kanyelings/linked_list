package com.kanyelings;

/**
 * Main class
 */
public class Main {
    // first create an object of the class before testing

    public static void main(String[] args) {
//    	To test all the implemented functions
    	LinkedListImpl ll = new LinkedListImpl();
//    	test to check if linked list is empty when initialized
    	System.out.println(ll.isEmpty());
//    	test to add elements at front of list
    	ll.addFirst(1);
    	ll.addFirst(2);
    	ll.addFirst(3);
    	ll.addFirst(4);
// 		test to add elements at back of list    	
    	ll.addLast(5);
    	System.out.println(ll.size());
    	System.out.println(ll.isEmpty());
//    	fetching first element, should print 4
    	System.out.println(ll.first());
//    	fetching last element, should print 5
    	System.out.println(ll.last());
//    	removing first element of list, should print 4
    	System.out.println(ll.remove());
//    	fetching first element, should print 3
    	System.out.println(ll.first());
    }
}
