//  https://leetcode.com/problems/increasing-decreasing-string/description/

class Solution {
    public String sortString(String s) {
        int[] freq = new int[26];

        for(char ch:s.toCharArray()){
            freq[ch - 'a']++;
        } 

         StringBuilder result = new StringBuilder();
         
        while (result.length() < s.length()) {
            // Step 1: Pick from a-z (increasing order)
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    result.append((char)(i + 'a'));
                    freq[i]--;
                }
            }

            // Step 2: Pick from z-a (decreasing order)
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    result.append((char)(i + 'a'));
                    freq[i]--;
                }
            }
        }
        return result.toString();
    }
}