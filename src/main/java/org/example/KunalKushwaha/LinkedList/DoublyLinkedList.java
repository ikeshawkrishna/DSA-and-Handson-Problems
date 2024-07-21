package org.example.KunalKushwaha.LinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    DoublyLinkedList(){
        this.size = 0;
    }

    void insertFirst(int value){
        Node node = new Node(value);

        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    void insertLast(int value){
        Node node = new Node(value);

        if(head == null){
            insertFirst(value);
            return;
        }

        node.prev = tail;
        node.next = null;
        tail.next = node;

        tail = node;

        size++;
    }

    void insert(int value,int index){
        if(index == 0){
            insertFirst(value);
            return;
        } else if (index == size-1){
            insertLast(value);
            return;
        }
        Node prevNode = get(index - 1);

        Node node = new Node(value,prevNode,prevNode.next);
        prevNode.next.prev = node;
        prevNode.next = node;
        size += 1;
    }

    Node get (int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    void displayReverse(){
        Node temp = tail;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    public class Node{
        int value;
        Node prev;
        Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value,Node prev,Node next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
