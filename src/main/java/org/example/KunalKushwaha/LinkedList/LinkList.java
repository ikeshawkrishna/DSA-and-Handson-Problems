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

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;

        return value;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }

        return null;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public class Node{
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
