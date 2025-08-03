// Last updated: 8/3/2025, 2:15:16 PM
 
import java.util.Arrays;

public class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {
            // Check if current window is not balanced
            while (nums[right] > (long) nums[left] * k) {
                left++;
            }
            // Update max length of balanced subarray
            maxLen = Math.max(maxLen, right - left + 1);
        }

        // Minimum removals = total elements - max balanced subarray length
        return n - maxLen;
    }
}
