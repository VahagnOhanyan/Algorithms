package org.example.linkedlist;

public class ReversingLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode nextNode = new ListNode(2);
        head.next = nextNode;
        ListNode nextnextNode = new ListNode(0);
        nextNode.next = nextnextNode;
        ListNode nextnextnextNode = new ListNode(-4);
        nextnextNode.next = nextnextnextNode;
        nextnextnextNode.next = null;
        System.out.println(reverseList(head));
    }
}
