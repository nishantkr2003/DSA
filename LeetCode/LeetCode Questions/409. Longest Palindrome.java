//  https://leetcode.com/problems/longest-palindrome/description/


class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128]; // ASCII

        // Count each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        // Loop over all character counts
        for (int i = 0; i < 128; i++) {
            if (count[i] % 2 == 0) {
                length += count[i];
            } else {
                length += count[i] - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) {
            length += 1; // One odd character can be in the middle
        }

        return length;
    }
}
