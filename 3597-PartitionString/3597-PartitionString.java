// Last updated: 7/2/2025, 9:37:43 AM
import java.util.*;

class Solution {
    public List<String> partitionString(String s) {
        Set<String> seen = new HashSet<>();
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (char ch : s.toCharArray()) {
            current.append(ch);
            if (!seen.contains(current.toString())) {
                String segment = current.toString();
                result.add(segment);
                seen.add(segment);
                current = new StringBuilder();  // Start a new segment
            }
        }

        // If any remaining characters left in current (in case the last segment is seen before)
         

        return result;
    }
}
