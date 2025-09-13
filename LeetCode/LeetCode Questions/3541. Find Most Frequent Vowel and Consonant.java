//  https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/?envType=daily-question&envId=2025-09-13

class Solution {
    public int maxFreqSum(String s) {
        int[] vowelFreq = new int[26];   
        int[] consonantFreq = new int[26]; 

        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);  
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelFreq[c - 'a']++;  
            } else {
                consonantFreq[c - 'a']++;
            }
        }
        int maxVowel = 0;
        for (int i = 0; i < 26; i++) {
            if (vowelFreq[i] > maxVowel) {
                maxVowel = vowelFreq[i];
            }
        }
        int maxConsonant = 0;
        for (int i = 0; i < 26; i++) {
            if (consonantFreq[i] > maxConsonant) {
                maxConsonant = consonantFreq[i];
            }
        }
        return maxVowel + maxConsonant;
    }
}