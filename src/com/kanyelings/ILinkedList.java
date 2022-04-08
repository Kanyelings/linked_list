package com.kanyelings;

public interface ILinkedList {
    public int size();
    public boolean isEmpty();
    public String first();
    public String last();
    public void addFirst();

    // update methods
    void addFirst(String data);

    public void addLast();
    public String removeFirst();

    void addLast(String data);

    void show();
}
