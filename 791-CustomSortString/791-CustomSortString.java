// Last updated: 7/3/2025, 6:12:07 PM
class Solution {
    public String customSortString(String order, String s) {
        StringBuilder response= new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
       
        for(char i: s.toCharArray()){ 
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        


        for(char i: order.toCharArray()){ 
            if(map.containsKey(i)){ 
                int count = map.get(i);

                while(count!= 0){ 
                    map.put(i,count-1);
                    count--;


                 

                response.append(i);
                }
                map.remove(i);

            }
         
        }
// String responseString = response.toString();

for(char ch: map.keySet()){ 
int count = map.get(ch);

while(count !=0 ){ 
    response.append(ch);
count--;
}
// map.remove(ch);

}
 
         

        return response.toString();

    }
}