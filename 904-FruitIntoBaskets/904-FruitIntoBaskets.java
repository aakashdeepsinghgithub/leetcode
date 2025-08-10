// Last updated: 8/10/2025, 2:41:47 PM
class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer,Integer> mp = new HashMap<>();
        int i = 0;
        int j = 0;
        int n = fruits.length;
        int ans = 0;

        while(j<n){
            mp.put(fruits[j], mp.getOrDefault(fruits[j], 0) + 1);   
            while(mp.size() > 2){
                mp.put(fruits[i], mp.get(fruits[i]) - 1);   
                if(mp.get(fruits[i]) == 0){
                    mp.remove(fruits[i]);
                }
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;

        }
        return ans;

    }
}