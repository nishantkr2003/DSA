// https://leetcode.com/problems/convert-to-base-2/description/

class Solution {
    public String baseNeg2(int n) {
        if(n == 0) return "0";

        StringBuilder result = new StringBuilder();
        while(n != 0){
            int reminder = n % -2;
            n /= -2;

            if(reminder<0){
                reminder += 2;
                n += 1;
            }
            result.append(reminder);
        }

        return result.reverse().toString();
    }
}