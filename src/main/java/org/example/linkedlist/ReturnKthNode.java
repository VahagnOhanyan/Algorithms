package org.example.linkedlist;

public class ReturnKthNode {
    private static int find(ListNode head, int nodeNumber) {
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 1; i < nodeNumber; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.val;

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
        nextnextnextnextNode.next = null;
        System.out.println(find(head, 2));
    }
}
