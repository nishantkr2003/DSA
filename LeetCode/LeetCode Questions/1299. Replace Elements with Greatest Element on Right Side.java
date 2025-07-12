// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/submissions/1694913735/


class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int min = -1;

        for(int i=n-1;i>=0;i--){
            int curr = arr[i];
            arr[i] = min;
            min = Math.max(min , curr);
        }
        return arr;
    }
}