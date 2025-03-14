package org.example.linkedlist;

public class ConvertBinaryNumberInALinkedListToInteger {

    public static int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }

        return Integer.parseInt(sb.toString(), 2);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode nextNode = new ListNode(0);
        head.next = nextNode;
        ListNode nextnextNode = new ListNode(1);
        nextNode.next = nextnextNode;
        ListNode nextnextnextNode = new ListNode(0);
        nextnextNode.next = nextnextnextNode;
        ListNode nextnextnextnextNode = new ListNode(1);
        nextnextnextNode.next = nextnextnextnextNode;
        int i = getDecimalValue(head);
        System.out.printf(String.valueOf(i));

    }
}
