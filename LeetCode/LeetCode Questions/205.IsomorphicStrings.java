//  https://leetcode.com/problems/isomorphic-strings/description/


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            // Compare index of first occurrence of s.charAt(i) and t.charAt(i)
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}