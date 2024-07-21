package org.example.KunalKushwaha.LinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;
    private int size ;

    CircularLinkedList(){
        this.size = 0;
    }


    void insertFirst(int value){
        Node node = new Node(value);

        if(tail == null){
            tail = node;
            head = node;
            return;
        }

        node.next = head;
        tail.next = node;
        head = node;


        size++;
    }

    void delete(int value){
        Node temp = head;

        if(value == temp.value){
            head = head.next;
            tail.next = temp.next;
            return;
        }

        do{
            if(value == temp.next.value){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);
    }

    void display(){
        Node temp = head;
        while (temp != tail){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.value + " -> END");
    }

    public class Node{
        int value;
        Node prev;
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
