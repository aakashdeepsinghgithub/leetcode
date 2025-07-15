// Last updated: 7/15/2025, 11:06:51 PM
class Solution {
    public boolean isValid(String word) {
    if (word.length() < 3) return false;
    boolean hasVowel = false, hasConsonant = false;
    for (char ch : word.toCharArray()) {
        if (!Character.isLetterOrDigit(ch)) return false;
        char lower = Character.toLowerCase(ch);
        if ("aeiou".indexOf(lower) != -1) hasVowel = true;
        else if (Character.isLetter(lower)) hasConsonant = true;
    }
    return hasVowel && hasConsonant;
}

}