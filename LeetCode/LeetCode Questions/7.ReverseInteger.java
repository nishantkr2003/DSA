// https://leetcode.com/problems/reverse-integer/description/


// Code


class Solution {
    public int reverse(int x) {
        int reverseNum = 0;
        while(x != 0){
            int last = x % 10 ;
            if(reverseNum<Integer.MIN_VALUE/10 || reverseNum>Integer.MAX_VALUE/10){
                return 0;
            }
            reverseNum = reverseNum *10 + last ;
            x=x/10;
        }
        return reverseNum ;
    }
}