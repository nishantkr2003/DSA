//  https://leetcode.com/problems/check-if-n-and-its-double-exist/

class Solution {
    public static boolean checkIfExist(int[] arr) {
        
    	int n =  arr.length;
    	
    	for (int i = 0; i < n; i++) {
			
    		for (int j = i+1; j < n; j++) {
				
    			if(arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i] ) {
    				return true;
    			}
    			
    			
			}
	
    		
		}
    	return false;
    }
}