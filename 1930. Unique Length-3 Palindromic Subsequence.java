import java.util.HashSet;

class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] first = new int[26];
        int[] last = new int[26];
        int n = s.length();
        
        // Initialize first and last occurrences
        for (int i = 0; i < 26; i++) {
            first[i] = -1;
            last[i] = -1;
        }
        
        // Record the first and last occurrence of each character
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (first[c - 'a'] == -1) {
                first[c - 'a'] = i;
            }
            last[c - 'a'] = i;
        }
        
        int count = 0;
        
        // Check for unique palindromic subsequences
        for (int i = 0; i < 26; i++) {
            if (first[i] != -1 && last[i] > first[i] + 1) {
                HashSet<Character> uniqueMiddle = new HashSet<>();
                for (int j = first[i] + 1; j < last[i]; j++) {
                    uniqueMiddle.add(s.charAt(j));
                }
                count += uniqueMiddle.size();
            }
        }
        
        return count;
    }
}
