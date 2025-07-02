// Last updated: 7/2/2025, 9:57:01 AM
import java.util.*;

class Solution {
    public List<String> partitionString(String s) {
         Set<String> set = new HashSet<>();
         List<String> result = new ArrayList<>();
        //  StringBuilder current = new StringBuilder();
        String ss="";

         for(char ch : s.toCharArray()){ 
            // current.append(ch);
            ss+=ch;
            // String segment = current.toString();
            if(!set.contains(ss)){ 
                set.add(ss);
                result.add(ss);

                // current = new StringBuilder();
                ss="";
            }

         }
         return result;
    }
}
