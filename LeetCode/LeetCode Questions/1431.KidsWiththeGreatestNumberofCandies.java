//  https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int n = candies.length;
        int max = candies[0];

        for(int i =0;i<n;i++){

            if(max<candies[i]){
                max = candies[i];
            }
        }

        for(int i=0;i<n;i++){
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}