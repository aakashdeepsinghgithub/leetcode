// Last updated: 6/20/2025, 11:16:56 PM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        return nums[l/2];
    }
}