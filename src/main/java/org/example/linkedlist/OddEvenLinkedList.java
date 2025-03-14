package org.example.linkedlist;

public class OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odds = null;
        ListNode oddsRef = null;
        ListNode evens = null;
        ListNode evensRef = null;
        ListNode current = head;
        int i = 1;
        while (current != null) {

            if (i++ % 2 == 1) {
                if (odds == null) {
                    odds = current;
                    oddsRef = current;
                } else {
                    odds.next = current;
                    odds = odds.next;
                }
            } else {
                if (evens == null) {
                    evens = current;
                    evensRef = current;
                } else {
                    evens.next = current;
                    evens = evens.next;
                }
            }
            if (current.next == null && evens != null) {
                evens.next = null;
                odds.next = null;
            }
            current = current.next;
        }
        if (evens != null) {
            odds.next = evensRef;
            head = oddsRef;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(8);
        ListNode nextNode = new ListNode(2);
        head.next = nextNode;
        ListNode nextnextNode = new ListNode(6);
        nextNode.next = nextnextNode;
        ListNode nextnextnextNode = new ListNode(3);
        nextnextNode.next = nextnextnextNode;
        ListNode nextnextnextnextNode = new ListNode(5);
        nextnextnextNode.next = nextnextnextnextNode;
        head = oddEvenList(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
