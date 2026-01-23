package org.dsa.KunalKushwaha.LinkedList;

import java.util.List;

public class InterviewQuestions {

    private ListNode head;
    private ListNode tail;

    public ListNode getHead() {
        return head;
    }

    public ListNode getTail() {
        return tail;
    }

    //https://leetcode.com/problems/reorder-list/description/
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode temphead = head;
        ListNode mid = mid(head);
        ListNode headSecond = reverse(mid);

        while(head != null && headSecond != null){
            ListNode temp = head.next;
            head.next = headSecond;
            head = temp;

            temp = headSecond.next;
            headSecond.next = head;
            headSecond = temp;
        }
        if(head != null){
            head.next = null;
        }
    }

    //https://leetcode.com/problems/palindrome-linked-list/
    public boolean isPalindrome(ListNode head){
        ListNode mid = mid(head);
        ListNode headSecond = reverse(mid);
        ListNode rereverseHead = headSecond;

        while(head != null && headSecond != null){
            if(head.value != headSecond.value){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverse(rereverseHead);

        if(head == null || headSecond == null){
            return true;
        }
        return false;
    }

    public ListNode mid(ListNode head){
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }

    public void insertAtFirst(int value){
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
    }

    public void display(ListNode head){
        ListNode temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    class ListNode {
        int value;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x) {
            value = x;
            next = null;
        }
    }
}
