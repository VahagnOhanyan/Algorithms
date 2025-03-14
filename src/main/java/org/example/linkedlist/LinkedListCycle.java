package org.example.linkedlist;

public class LinkedListCycle {


    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode nextNode = new ListNode(2);
        head.next = nextNode;
        ListNode nextnextNode = new ListNode(0);
        nextNode.next = nextnextNode;
        ListNode nextnextnextNode = new ListNode(-4);
        nextnextNode.next = nextnextnextNode;
        nextnextnextNode.next = nextNode;
        System.out.println(hasCycle(head));

    }

}
