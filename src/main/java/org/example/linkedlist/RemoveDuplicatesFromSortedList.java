package org.example.linkedlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode prev = head;
        ListNode next = head.next;
        while (next != null) {
            if (prev.val == next.val) {
                prev.next = next.next;
                next = next.next;
                continue;
            }
            prev = prev.next;
            next = next.next;

        }


       /* Map<Integer, ListNode> map = new HashMap<>();
        ListNode current = head;
        while (head.next != null) {
            if (map.containsKey(head.val)) {
                map.get(head.val).next = head.next;
                current = head.next;
            }
            map.put(current.val, current);
            head = head.next;
        }*/
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode nextNode = new ListNode(1);
        head.next = nextNode;
        ListNode nextnextNode = new ListNode(2);
        nextNode.next = nextnextNode;
        ListNode nextnextnextNode = new ListNode(3);
        ListNode nextnextnextnextNode = new ListNode(3);
        nextnextNode.next = nextnextnextNode;
        nextnextnextNode.next = nextnextnextnextNode;
        nextnextnextnextNode.next = null;
        head = deleteDuplicates(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }


}
