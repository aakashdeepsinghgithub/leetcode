// Last updated: 7/2/2025, 9:52:21 AM
import java.util.*;

class Solution {
    public List<String> partitionString(String s) {
         Set<String> set = new HashSet<>();
         List<String> result = new ArrayList<>();
         StringBuilder current = new StringBuilder();

         for(char ch : s.toCharArray()){ 
            current.append(ch);
            String segment = current.toString();
            if(!set.contains(segment)){ 
                set.add(segment);
                result.add(segment);

                current = new StringBuilder();
            }

         }
         return result;
    }
}
