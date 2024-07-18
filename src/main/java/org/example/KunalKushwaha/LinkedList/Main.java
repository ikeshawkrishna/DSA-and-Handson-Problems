package org.example.KunalKushwaha.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.insertAtFirst(7);
        list.insertAtFirst(11);
        list.insertAtFirst(5);
        list.insertAtFirst(4);
        list.insertLast(15);

        list.insert(100,3);
        list.printList();
        list.deleteFirst();

        list.printList();

        System.out.println(list.deleteLast());
        list.printList();

        System.out.println(list.delete(1));
        list.printList();

    }
}
