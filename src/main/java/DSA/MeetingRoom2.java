package DSA;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;


public class MeetingRoom2 {
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0) return 0;

        Collections.sort(intervals, (a, b) ->a.start - b.start);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (Interval interval : intervals) {
            if (!minHeap.isEmpty() && interval.start >= minHeap.peek()) {
                minHeap.poll();
            }

            minHeap.offer(interval.end);
        }
        return minHeap.size();
    }


}
