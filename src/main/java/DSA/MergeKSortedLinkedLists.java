package DSA;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLinkedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

        // Add first node of each list
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        // Dummy node
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (!minHeap.isEmpty()) {
            // Get smallest node
            ListNode smallest = minHeap.poll();

            current.next = smallest;
            current = current.next;

            // if next node exists, add to heap
            if (smallest.next != null) {
                minHeap.offer(smallest.next);
            }
        }
        return dummy.next;
    }
}
