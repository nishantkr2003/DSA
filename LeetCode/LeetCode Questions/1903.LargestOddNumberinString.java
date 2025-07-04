///https://leetcode.com/problems/largest-odd-number-in-string/description/
/// 
/// 



class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);

            // Convert the character to an integer (digit)
            int digit = ch - '0';
            if (digit % 2 != 0) {
                // If odd, return the substring from start to this digit (inclusive)
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}