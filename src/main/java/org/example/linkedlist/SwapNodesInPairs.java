package org.example.linkedlist;

public class SwapNodesInPairs { // 1 2 3 4    2 1 4 3
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode current = head;
        ListNode next;
        ListNode prev = null;
        ListNode dummy;
        dummy = head.next;
        while (current != null && current.next != null) {
            if (prev != null) {
                prev.next = current.next;  // Step 4
            }
            prev = current;
            next = current.next.next;
            current.next.next = current;
            current.next = next;
            current = next;

        }
        return dummy;
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
        System.out.println(swapPairs(head));
    }
}
