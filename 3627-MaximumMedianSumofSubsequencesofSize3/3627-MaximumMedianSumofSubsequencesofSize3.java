// Last updated: 7/28/2025, 11:17:50 PM
class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);

        int i=0;
        int j=nums.length-2;
        long sum=0;

        while(i<j){ 
            sum+=nums[j];
            i++;
            j-=2;
        }
        return sum;
    }
}