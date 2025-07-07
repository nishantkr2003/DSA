//  https://leetcode.com/problems/string-compression-iii/description/


class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < word.length()) {
            char ch = word.charAt(i);
            int count = 0;

            while (i < word.length() && word.charAt(i) == ch) {
                i++;
                count++;
            }

            while (count > 0) {
                int chunk = Math.min(count, 9);
                sb.append(chunk).append(ch);
                count -= chunk;
            }
        }

        return sb.toString();
    }
}
