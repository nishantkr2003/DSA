//  https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/1626291182/


class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }

        boolean[] arr = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            arr[c - 'a'] = true;  // Mark the letter as seen
        }

        for (int i = 0; i < 26; i++) {
            if (!arr[i]) return false;  // If any letter is missing
        }

        return true;
    }
}