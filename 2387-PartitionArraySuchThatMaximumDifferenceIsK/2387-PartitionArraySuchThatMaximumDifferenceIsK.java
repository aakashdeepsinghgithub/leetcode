// Last updated: 7/5/2025, 11:12:44 PM
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