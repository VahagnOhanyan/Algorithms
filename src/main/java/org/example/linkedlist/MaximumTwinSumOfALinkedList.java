package org.example.linkedlist;

public class MaximumTwinSumOfALinkedList {
    private static int max = 0;
    private static ListNode recurse;

    public static int pairSum(ListNode head) {
        recurse = head;
        recursiveSum(head);
        return max;
    }

    private static boolean recursiveSum(ListNode head) {
        if (head != null) {
            if (!recursiveSum(head.next)) return false;
            max = Math.max(max, head.val + recurse.val);
            recurse = recurse.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        ListNode nextNode = new ListNode(9);
        head.next = nextNode;
        ListNode nextnextNode = new ListNode(6);
        nextNode.next = nextnextNode;
        ListNode nextnextnextNode = new ListNode(6);
        nextnextNode.next = nextnextnextNode;
        ListNode nextnextnextnextNode = new ListNode(7);
        nextnextnextNode.next = nextnextnextnextNode;
        ListNode a = new ListNode(8);
        nextnextnextnextNode.next = a;
        ListNode b = new ListNode(3);
        a.next = b;
        ListNode c = new ListNode(0);
        b.next = c;
        ListNode d = new ListNode(9);
        c.next = d;
        ListNode e = new ListNode(5);
        d.next = e;
        System.out.println(pairSum(head));
    }
}
