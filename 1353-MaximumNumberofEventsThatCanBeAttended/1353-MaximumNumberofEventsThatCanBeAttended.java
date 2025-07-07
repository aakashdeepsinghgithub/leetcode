// Last updated: 7/7/2025, 11:09:22 PM
import java.util.*;

public class Solution {
    public int maxEvents(int[][] events) {
        // Sort events by start day
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));

        // Min-heap to store end days of active events
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int i = 0, n = events.length;
        int day = 0, count = 0;

        // Get the maximum end day to limit the loop
        int lastDay = 0;
        for (int[] event : events) {
            lastDay = Math.max(lastDay, event[1]);
        }

        // Loop from day 1 to the last possible day
        for (day = 1; day <= lastDay; day++) {
            // Add all events starting today to the heap
            while (i < n && events[i][0] == day) {
                minHeap.offer(events[i][1]);
                i++;
            }

            // Remove all events that have already ended
            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }

            // Attend the event that ends earliest
            if (!minHeap.isEmpty()) {
                minHeap.poll();
                count++;
            }
        }

        return count;
    }
}
