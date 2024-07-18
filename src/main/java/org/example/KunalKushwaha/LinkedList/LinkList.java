package org.example.KunalKushwaha.LinkedList;

import java.security.PublicKey;

public class LinkList {

    private Node head;
    private Node tail;
    private int size;

    LinkList(){
        size = 0;
    }

    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int value){
        if(tail == null){
            insertAtFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
    }

    public void insert(int value,int index){
        if(index == 0){
            insertAtFirst(value);
            return;
        } else if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < size; i++) {
            temp = temp.next;
        }

        Node node = new Node(value,temp.next);
        temp.next = node;

        size++;

    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }


}
