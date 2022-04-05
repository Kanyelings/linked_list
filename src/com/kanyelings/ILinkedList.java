package com.kanyelings;

public interface ILinkedList {
	public int size();
    public boolean isEmpty();
    public String first();
    public String last();
    public void addFirst(int data);
    public void addLast(int data);
    public String remove();
}
