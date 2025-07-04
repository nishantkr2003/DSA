
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

//1295. Find Numbers with Even Number of Digits



class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    static int even(int number){
        int count = 0;
        while(number != 0){
            number = number/10;
            count++;
        }
        return count;
    }
}