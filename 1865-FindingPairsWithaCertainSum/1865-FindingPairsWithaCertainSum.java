// Last updated: 7/7/2025, 1:03:18 AM
import java.util.*;

class FindSumPairs {
    private int[] nums1, nums2;
    private Map<Integer, Integer> freqMap;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        freqMap = new HashMap<>();
        for (int num : nums2) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int oldVal = nums2[index];
        int newVal = oldVal + val;
        freqMap.put(oldVal, freqMap.get(oldVal) - 1);
        if (freqMap.get(oldVal) == 0) freqMap.remove(oldVal);
        freqMap.put(newVal, freqMap.getOrDefault(newVal, 0) + 1);
        nums2[index] = newVal;
    }

    public int count(int tot) {
        int result = 0;
        for (int n1 : nums1) {
            int target = tot - n1;
            result += freqMap.getOrDefault(target, 0);
        }
        return result;
    }
}
