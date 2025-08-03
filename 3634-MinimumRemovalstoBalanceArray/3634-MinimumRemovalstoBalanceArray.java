// Last updated: 8/3/2025, 5:29:33 PM
 
import java.util.Arrays;

public class Solution {
    public int minRemoval(int[] nums, int k) {
         Arrays.sort(nums);
         int size =nums.length;
         int left=0,maxl=0;


         for(int right=0;right<size;right++){ 
                while(nums[right] > (long)nums[left]*k){
                    left++;
                }
            maxl=Math.max(maxl,right-left+1);
         }
         return size-maxl;
    }
}
                                                                                                                    