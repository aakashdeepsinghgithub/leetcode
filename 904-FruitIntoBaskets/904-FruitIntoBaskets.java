// Last updated: 8/13/2025, 10:23:28 PM
class Solution {
    public int totalFruit(int[] fruits) {

         Map<Integer,Integer> basket = new HashMap<>();

         int left =0;
         int right = 0;
         int max=0;
         int n = fruits.length;

         while(right<n){ 
                basket.put(fruits[right],basket.getOrDefault(fruits[right],0)+1);
            while(basket.size()>2){ 
                basket.put(fruits[left],basket.get(fruits[left])-1);

                if(basket.get(fruits[left]) == 0){ 
                    basket.remove(fruits[left]);
                }
                left++;
            }
            max = Math.max(max,right-left+1);
            right++;
         }
return max;
    }
}