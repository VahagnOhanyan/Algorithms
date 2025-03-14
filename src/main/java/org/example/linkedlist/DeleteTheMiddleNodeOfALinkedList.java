package org.example.linkedlist;

public class DeleteTheMiddleNodeOfALinkedList {


    public static ListNode deleteMiddle(ListNode head) {
        if (head != null && head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = slow.next;
        }
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
        head = deleteMiddle(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
