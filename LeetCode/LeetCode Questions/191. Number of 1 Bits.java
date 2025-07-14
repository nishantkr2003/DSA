// https://leetcode.com/problems/number-of-1-bits/

class Solution {
    public int hammingWeight(int n) {
        // StringBuilder binary = new StringBuilder();
        // while (n > 0) {
        //     int remainder = n % 2;
        //     binary.insert(0, remainder);
        //     n /= 2;
        // } 
        // int count=0;
        // for(int i=0;i<binary.length();i++){
            
        //     char c = binary.charAt(i);

        //     if(c == '1'){
        //         count++;
        //     }
        // }
        // return count;


       int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;  // Unsigned right shift
        }
        return count;
    }
}