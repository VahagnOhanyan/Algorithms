package org.example.linkedlist;

public class RemoveDuplicatesFromSortedListII {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode sentinel = new ListNode(0, head);

        // predecessor = the last node
        // before the sublist of duplicates
        ListNode pred = sentinel;

        while (head != null) {
            // If it's a beginning of the duplicates sublist
            // skip all duplicates
            if (head.next != null && head.val == head.next.val) {
                // Move till the end of the duplicates sublist
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }

                // Skip all duplicates
                pred.next = head.next;
                // otherwise, move predecessor
            } else {
                pred = pred.next;
            }

            // move forward
            head = head.next;
        }
        return sentinel.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode nextNode = new ListNode(2);
        head.next = nextNode;
        ListNode nextnextNode = new ListNode(2);
        nextNode.next = nextnextNode;
        ListNode nextnextnextNode = new ListNode(4);
        nextnextNode.next = nextnextnextNode;
        ListNode nextnextnextnextNode = new ListNode(4);
        nextnextnextNode.next = nextnextnextnextNode;
        head = deleteDuplicates(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
