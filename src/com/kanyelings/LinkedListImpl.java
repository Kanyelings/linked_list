package com.kanyelings;

public class LinkedListImpl implements ILinkedList{
  static int size = 0;
  Node head;

  @Override
  public int size() {
      return size;
  }

  @Override
  public  void addFirst(String value) {
      Node node = new Node();
      node.data = value;
      if(head != null) {   // Check's for an existing node
          node.next = head;
      }
      head = node;
      size++;
  }

  @Override
  public void addLast(String value) {
      Node last = new Node();
      last.data = value;
      Node node = head;
      while(node.next != null){    // Check's if we are at the last node
          node = node.next;
      }
      node.next = last;
      size++;
  }

  @Override
  public String removeFirst() {
      Node node = head.next;
      head.next = null;    // Removing head from linked list
      head = node;    // Making next node head
      size--;
      return head.data;
  }

  @Override
  public void show() {
      Node node = head;
      String[] listShow = new String[size()];
      int i = 0;
      while(node != null){    // Going through every node in the Link List
          listShow[i] = node.data;    // Storing each node in an array
          node = node.next;
          i++;
      }
      System.out.println(Arrays.toString(listShow));
  }

  @Override
  public boolean isEmpty() {
      return (size == 0);
  }

  @Override
  public String first() {
      return head.data;
  }

  @Override
  public String last() {
      Node node = head;
      while(node.next != null)    // looking for last node in the linked list
          node = node.next;
      return node.data;
  }

  @Override
  public void insert(int index, String value) {
      Node node = head;
      Node tempNode;   // temporal store for a node
      int count = 0;
      Node newNode = new Node();
      newNode.data = value;
      while(node != null) {    // Going Through the nodes of the linked list
          if (count == index - 1){     // checks if it is time to insert
              tempNode = node.next;
              node.next = newNode;
              newNode.next = tempNode;
              size++;
          }
          node = node.next;
          count++;
      }
  }
}
