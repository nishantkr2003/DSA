
// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/





class Solution {
    public int smallestDivisor(int[] nums, int thr) {
        int left = 1 , right = max(nums) , ans = 0;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(isValid(nums , mid , thr)){
                ans = mid;
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return ans;
    }
    public boolean isValid(int [] nums , int mid , int thr){
        double sum = 0;
        for(int i : nums){
            sum += Math.ceil((double)i/mid);
            if(sum > thr) return false;
        }
        return sum<=thr;
    }
    public int max(int [] nums){
        int max = -1;
        for(int i : nums) max = Math.max(max , i);
        return max;
    }
}