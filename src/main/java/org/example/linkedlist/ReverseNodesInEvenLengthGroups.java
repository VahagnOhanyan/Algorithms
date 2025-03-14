package org.example.linkedlist;

public class ReverseNodesInEvenLengthGroups {
    public static ListNode reverseEvenLengthGroups(ListNode head) {
        if (head == null || head.next == null) return head;
        int k = 0;
        ListNode newlist = head;
        ListNode current;
        ListNode next;
        while (head != null) {
            k++;
            current = head;
            for (int i = 0; i < k; i++) {
                next = head.next;
                if (k % 2 == 0) {
                    head.next = current;
                    if (head == current) {
                        head.next = null;
                    }
                }
                current = head;
                head = next;
                if (head == null) return head;
            }


            //head = head.next;
        }

        return newlist;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode nextNode = new ListNode(2);
        head.next = nextNode;
        ListNode nextnextNode = new ListNode(3);
        nextNode.next = nextnextNode;
       /* ListNode nextnextnextNode = new ListNode(4);
        nextnextNode.next = nextnextnextNode;
        ListNode nextnextnextnextNode = new ListNode(5);
        nextnextnextNode.next = nextnextnextnextNode;*/
        head = reverseEvenLengthGroups(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
