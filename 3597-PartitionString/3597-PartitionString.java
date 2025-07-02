// Last updated: 7/2/2025, 9:45:35 AM
import java.util.*;

class Solution {
    public List<String> partitionString(String s) {
        Set<String> seen = new HashSet<>();
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (char ch : s.toCharArray()) {
            current.append(ch);
            String segment = current.toString();
            if (!seen.contains(segment)) {
                
                result.add(segment);
                seen.add(segment);
                current = new StringBuilder();  // Start a new segment
            }
        }
 
         

        return result;
    }
}
