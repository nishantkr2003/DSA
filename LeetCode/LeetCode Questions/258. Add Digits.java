// https://leetcode.com/problems/add-digits/description/


class Solution {
    public int addDigits(int num) {
        while (num >= 10) { // loop until it's a single-digit number
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
