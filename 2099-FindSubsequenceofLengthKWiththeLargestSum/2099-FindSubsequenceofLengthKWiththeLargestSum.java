// Last updated: 6/28/2025, 4:00:15 PM
import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        // Max Heap: store (value, index)
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < nums.length; i++) {
            maxHeap.offer(new int[]{nums[i], i});
        }

        // Get top k elements
        List<int[]> topK = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            topK.add(maxHeap.poll());
        }

        // Sort by original index to keep subsequence order
        topK.sort(Comparator.comparingInt(a -> a[1]));

        // Extract only values
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK.get(i)[0];
        }

        return result;
    }
}
