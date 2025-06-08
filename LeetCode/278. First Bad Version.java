//  https://leetcode.com/problems/first-bad-version/




public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isBadVersion(mid)==false){
                l = mid+1;
            }
            else if(isBadVersion(mid)==true){
                r = mid-1;
            }
        }
        return l;
    }
}