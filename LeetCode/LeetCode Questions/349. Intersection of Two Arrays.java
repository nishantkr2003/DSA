//  https://leetcode.com/problems/intersection-of-two-arrays/



import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n = nums1.length;
        int m = nums2.length;
        int[] temp = new int[Math.min(n, m)]; 
        int index = 0;

        int i = 0, j = 0;

        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                // Check for duplicates before adding
                if (index == 0 || temp[index - 1] != nums1[i]) {
                    temp[index++] = nums1[i];
                }
                i++;
                j++;
            }
        }

    
        int[] result = new int[index];
        for (int k = 0; k < index; k++) {
            result[k] = temp[k];
        }

        return result;
    }
}
