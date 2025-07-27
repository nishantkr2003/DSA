// https://leetcode.com/problems/happy-number/description/

class Solution {
    public boolean isHappy(int n) {
        int number = n;
        int sum = getSum(n);

        while(sum != 1 && number != sum){
            number = getSum(number);
            sum = getSum(getSum(sum));
        }
        return sum == 1;
    }

    public int getSum(int n){
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            sum += digit*digit;
            n=n/10;
        }
        return sum;
    }
}