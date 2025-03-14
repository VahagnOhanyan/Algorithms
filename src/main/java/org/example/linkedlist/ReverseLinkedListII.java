package org.example.linkedlist;

public class ReverseLinkedListII {

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;
        if (head.next == null) return head;
        if (left == right) return head;
        ListNode leftNode = null;
        ListNode start = head;
        ListNode prev = null;
        ListNode curr;
        ListNode next;
        for (int i = 1; i < left; i++) { // 1 2 3 4 5
            prev = start;
            leftNode = prev;
            start = start.next;

        }
        curr = start;
        while (left <= right) {
            next = curr.next; // remember ref to 3 // to 4 // to 5
            curr.next = prev; // 2 --> null // 3 -- > 2 // 4 -- > 3
            prev = curr; // prev  = 2 // prev = 3 // prev = 4
            curr = next; // curr  = 3 // curr  = 4 // curr = 5
            left++;
        }
        if (leftNode != null) {
            leftNode.next = prev; // 1 -- > 4
        } else {
            head = prev;
        }
        start.next = curr; // 2 --> 5
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
        int left = 2;
        int right = 4;

        head = reverseBetween(head, left, right);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
