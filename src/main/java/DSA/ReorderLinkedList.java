package DSA;

import com.fasterxml.jackson.core.JsonEncoding;

import java.util.List;

public class ReorderLinkedList {
    public void reorderList(ListNode head) {
        if (head == null && head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode prev = null;
        while (second != null) {
            ListNode nextTemp = second.next;
            second.next = prev;
            prev = second;
            second = nextTemp;
        }

        ListNode first = head;
        second = prev;
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next =  second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    public static void printList(ListNode head) {
        while (head !=null) {
            System.out.println(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReorderLinkedList solution = new ReorderLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        solution.reorderList(head);
        printList(head);
    }
}
