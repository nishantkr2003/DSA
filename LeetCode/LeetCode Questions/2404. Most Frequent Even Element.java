// https://leetcode.com/problems/most-frequent-even-element/description/


class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = -1;
        int maxCount  = 0;


        for(int num: nums){
            if(num%2!=0) continue;
            int count = map.getOrDefault(num,0)+1;
            map.put(num,count);

            if(count > maxCount  || 
                (count == maxCount  && num<ans))
            {
                maxCount = count;
                ans = num;

            }
        }
        return ans;
    }
}