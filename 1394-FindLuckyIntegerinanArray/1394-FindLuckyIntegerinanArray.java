// Last updated: 7/6/2025, 12:12:59 PM
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : arr){ 
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int answer=-1;
    for(int num : arr){ 
        if(num == map.get(num)) answer=Math.max(answer,num);
    }
    return answer;
    }
}