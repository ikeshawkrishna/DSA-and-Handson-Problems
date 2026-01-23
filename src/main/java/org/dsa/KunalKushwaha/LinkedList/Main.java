package org.dsa.KunalKushwaha.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //LinkList list = new LinkList();

//        list.insertAtFirst(7);
//        list.insertAtFirst(11);
//        list.insertAtFirst(5);
//        list.insertAtFirst(4);
//        list.insertAtFirst(1);
//        list.insertAtFirst(2);
//        list.insertLast(15);
//
//        list.insert(100,3);
//        list.display();
//        list.deleteFirst();
//
//        list.display();
//
//        System.out.println(list.deleteLast());
//        list.display();
//
//        System.out.println(list.delete(3));
//        list.display();

//        DoublyLinkedList doubleLL = new DoublyLinkedList();
//        doubleLL.insertFirst(2);
//        doubleLL.insertFirst(3);
//        doubleLL.insertFirst(1);
//        doubleLL.insertFirst(6);
//        doubleLL.insertFirst(11);
//        doubleLL.display();
//        doubleLL.displayReverse();

//        CircularLinkedList cll = new CircularLinkedList();
//        cll.insertFirst(2);
//        cll.insertFirst(3);
//        cll.insertFirst(12);
//        cll.insertFirst(5);
//        cll.insertFirst(8);
//        cll.display();
//
//
//        cll.delete(12);
//        cll.display();
//
//        cll.delete(8);
//        cll.display();


        InterviewQuestions ll = new InterviewQuestions();
//        ll.insertAtFirst(7);
//        ll.insertAtFirst(6);
//        ll.insertAtFirst(5);
        ll.insertAtFirst(4);
        ll.insertAtFirst(3);
        ll.insertAtFirst(2);
        ll.insertAtFirst(1);

        ll.reorderList(ll.getHead());

    }
}
