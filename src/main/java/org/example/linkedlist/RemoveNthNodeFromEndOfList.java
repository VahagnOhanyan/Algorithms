package org.example.linkedlist;

public class RemoveNthNodeFromEndOfList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        if (n <= 0) return head;
        ListNode right = head;
        ListNode curr = head;
        ListNode prev = null;
        for (int i = 0; i < n; i++) {
            if (right == null) return head;
            right = right.next;
        }
        if (right == null) {
            head = head.next;
            return head;
        }
        while (right != null) {
            prev = curr;
            curr = curr.next;
            right = right.next;
        }
        prev.next = curr.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode nextNode = new ListNode(2);
        head.next = nextNode;
        ListNode nextnextNode = new ListNode(3);
        nextNode.next = nextnextNode;
        ListNode nextnextnextNode = new ListNode(4);
        nextnextNode.next = nextnextnextNode;
        ListNode nextnextnextnextNode = new ListNode(5);
        nextnextnextNode.next = nextnextnextnextNode;
        int n = 2;
        head = removeNthFromEnd(head, n);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
