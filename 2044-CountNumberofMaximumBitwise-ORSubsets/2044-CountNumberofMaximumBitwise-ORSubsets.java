// Last updated: 7/28/2025, 11:06:41 PM
class Solution {
    private int maxOr = 0;
    private int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        dfs(nums, 0, 0);
        return count;
    }

    private void dfs(int[] nums, int index, int currOr) {
        if (index == nums.length) {
            if (currOr == maxOr) {
                count++;
            } else if (currOr > maxOr) {
                maxOr = currOr;
                count = 1;
            }
            return;
        }

        // Include nums[index]
        dfs(nums, index + 1, currOr | nums[index]);
        
        // Exclude nums[index]
        dfs(nums, index + 1, currOr);
    }
}
