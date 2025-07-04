



//https://leetcode.com/problems/sort-characters-by-frequency/description/




class Solution {
    public String frequencySort(String s) {
        // Step 1: Count frequency of each character (using an array for ASCII)
        int[] freq = new int[128];  // Array to store the frequency of each character
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // Step 2: Find the maximum frequency
        int maxFreq = 0;
        for (int i = 0; i < 128; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }

        
        StringBuilder result = new StringBuilder();
        
        // Iterate over frequencies from max to 1
        for (int i = maxFreq; i > 0; i--) {
            for (int j = 0; j < 128; j++) {
                if (freq[j] == i) {
                    // Append the character 'i' times
                    for (int k = 0; k < i; k++) {
                        result.append((char) j);
                    }
                }
            }
        }

        return result.toString();
    }
}
