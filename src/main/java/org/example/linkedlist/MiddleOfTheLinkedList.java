package org.example.linkedlist;

public class MiddleOfTheLinkedList {


    public static ListNode middleNode(ListNode head) {
           ListNode slow = head;
           ListNode fast = head;
           while (fast != null && fast.next != null) {
               slow = slow.next;
               fast = fast.next.next;
           }
          /* if(fast != null){
               slow = slow.next;
           }*/
             return slow;
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
        System.out.println(middleNode(head).val);
    }
}
