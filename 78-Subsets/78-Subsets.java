// Last updated: 8/1/2025, 10:45:47 PM
class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    
    void subsetUtility(int[] nums , List<Integer> temp, int index ){ 

        if(index >= nums.length){ 
            res.add(new ArrayList<Integer>(temp));
            return;
        }

        temp.add(nums[index]);
        subsetUtility(nums,temp,index+1);
        temp.remove(temp.size()-1);
        subsetUtility(nums,temp,index+1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        subsetUtility(nums,temp,0);
        return res;
    }
}