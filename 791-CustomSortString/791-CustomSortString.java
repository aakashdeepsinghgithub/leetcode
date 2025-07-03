// Last updated: 7/3/2025, 6:20:35 PM
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

// for(char ch: map.keySet()){ 
// int count = map.get(ch);

// while(count !=0 ){ 
//     response.append(ch);
// count--;
// }
// // map.remove(ch);

// }

List<Character> keys = new ArrayList<>(map.keySet());

for (int i = 0; i < keys.size(); i++) {
    char ch = keys.get(i);         // <-- THIS is 'ch'
    int count = map.get(ch);       // Use 'ch' to get count from the map

    while (count-- > 0) {
        response.append(ch);       // Append 'ch' multiple times
    }
    map.remove(ch);
}

 
         

        return response.toString();

    }
}