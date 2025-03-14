package org.example.linkedlist;

import org.w3c.dom.Node;

public class SwappingNodesInALinkedList {
    private static int i = 1;
    private static ListNode recurse;

    public static ListNode swapNodes(ListNode head, int k) {
        recurse = head;
        recursiveSwap(head, k);
        return head;
    }

    private static boolean recursiveSwap(ListNode head, int k) {
        if (head != null) {
            if (!recursiveSwap(head.next, k)) return false;
            if (i++ == k) {
                int temp = head.val;
                head.val = recurse.val;
                recurse.val = temp;
            }
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
        //e.next = null;
        /*ListNode f = new ListNode(4);
        e.next = f;*/
        int k = 5;
        head = swapNodes(head, k);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
