// https://leetcode.com/problems/vowels-game-in-a-string/description/?envType=daily-question&envId=2025-09-12


class Solution {
    public boolean doesAliceWin(String s) {
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                return true;
        }
        return false;
    }
}