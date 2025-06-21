// Last updated: 6/21/2025, 11:30:45 AM
class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int l = nums.length;
        // return nums[l/2];


        //By Boore Move Voting Algolrithm
        int candidate = nums[0];
        int count=1;

        for(int i=1 ; i<nums.length ;i++){ 
            if(nums[i] == candidate) count++;
            
            else if(nums[i] != candidate && count==1){ count--; candidate = nums[i]; count=1; }
            else if(nums[i] != candidate && count>0){ count--; }
            else if(nums[i]!=candidate && count < 0) {
                candidate = nums[i];
                count = 1;
        }}
        return candidate;
    }
}