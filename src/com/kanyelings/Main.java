package com.kanyelings;

/**
 * Main class
 */
public class Main {
    // first create an object of the class before testing

    public static void main(String[] args) {
       LinkedListInterface list = new LinkedList();
       System.out.println(list.isEmpty());
       list.addFirst("Joshua");
       list.show();
       list.addFirst("Josue");
       list.show();
       list.addLast("David");
       list.show();
       System.out.println(list.isEmpty());
       System.out.println(list.removeFirst());
       list.show();
       System.out.println(list.size());
       System.out.println(list.first());
       System.out.println(list.last());
       list.addLast("Samuel");
       list.insert(1, "John");
       list.show();
       list.remove("David");
       list.show();

    }
}
