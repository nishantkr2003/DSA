//  https://leetcode.com/problems/string-compression/description/


class Solution {
    public int compress(char[] chars) {
        int j = 0; // write pointer
        
        for (int i = 0; i < chars.length; ) {
            int c = 0;
            char ch = chars[i];
            
            // Count occurrences of ch
            while (i < chars.length && chars[i] == ch) {
                i++;
                c++;
            }
            
            chars[j++] = ch;
            
            if (c > 1) {
                String num = Integer.toString(c);
                for (char car : num.toCharArray()) {
                    chars[j++] = car;
                }
            }
        }
        
        return j;
    }
}
