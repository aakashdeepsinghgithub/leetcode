// Last updated: 7/5/2025, 11:12:39 PM
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                // Long press case
                j++;
            } else {
                // Mismatch not allowed
                return false;
            }
        }
        
        // All characters in name must be matched
        return i == name.length();
    }
}
