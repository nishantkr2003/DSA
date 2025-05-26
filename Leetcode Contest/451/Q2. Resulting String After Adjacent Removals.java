// https://leetcode.com/contest/weekly-contest-451/problems/resulting-string-after-adjacent-removals/



class Solution {
    public String resultingString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            int len = sb.length();
            
            if (len > 0) {
                char last = sb.charAt(len - 1);
                int diff = Math.abs(curr - last);
                if (diff == 1 || diff == 25) {
                    sb.deleteCharAt(len - 1); 
                    continue;
                }
            }

            sb.append(curr); 
        }

        return sb.toString();
    }
}
