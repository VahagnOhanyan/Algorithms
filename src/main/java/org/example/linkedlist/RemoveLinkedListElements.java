package org.example.linkedlist;

public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            while (current != null && current.val == val) {
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    head = current.next;
                }
                current = current.next;
            }
            if (current == null) return head;
            prev = current;
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode nextNode = new ListNode(2);
        head.next = nextNode;
        ListNode nextnextNode = new ListNode(2);
        nextNode.next = nextnextNode;
        ListNode nextnextnextNode = new ListNode(2);
        nextnextNode.next = nextnextnextNode;
        ListNode nextnextnextnextNode = new ListNode(2);
        nextnextnextNode.next = nextnextnextnextNode;
        int n = 2;
        head = removeElements(head, n);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
