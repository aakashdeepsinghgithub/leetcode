// Last updated: 6/20/2025, 2:36:56 PM
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);

        int count = 1;
        int start = nums[0];
        for(int i=0 ; i<nums.length ; i++){ 
            
            if(nums[i] - start > k){ 
                count++;
                start=nums[i];
            }
        }
        return count;
    }
}