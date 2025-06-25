// Last updated: 6/25/2025, 9:58:56 PM
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {

        Set<Integer> sett = new HashSet<>();


        for(int i=0 ; i<nums.length; i++){

            int start= Math.max(i-k,0);
            int end =Math.min(nums.length-1,i+k);

            for(int j = start ; j<=end ;j++) {

            
            
            if(nums[j]==key){ 
                sett.add(i);
            }
        }}
         


        List<Integer> result = new ArrayList<>(sett);
        Collections.sort(result);
        return result;
    }
}