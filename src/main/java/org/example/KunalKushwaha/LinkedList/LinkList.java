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
