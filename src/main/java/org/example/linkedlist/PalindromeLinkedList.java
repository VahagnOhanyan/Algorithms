package org.example.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    private static ListNode frontPointer;

    private static boolean recursivelyCheck(ListNode currentNode) {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) return false;
            if (currentNode.val != frontPointer.val) return false;
            frontPointer = frontPointer.next;
        }
        return true;
    }

    public static boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode nextNode = new ListNode(2);
        head.next = nextNode;
        ListNode nextnextNode = new ListNode(1);
        nextNode.next = nextnextNode;
        ListNode nextnextnextNode = new ListNode(3);
        nextnextNode.next = nextnextnextNode;
        boolean palindrome = isPalindrome(head);
        System.out.printf(String.valueOf(palindrome));
    }
}
