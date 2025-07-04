public class 69Sqrt {

    public int mySqrt(int x) {

        if( x== 0 || x ==1 ){
            return x;
        }

        int left=0;
        int right = x;
        int ans = 0;

        while(left < right){
            int mid = left + (right - left)/2;
            long squre = (long)mid*mid;

            if(squre == x){
                return mid;
            }

            else if(squre < x){
                ans = mid;
                left = mid + 1;
            }
            else{
                right  = mid -1;
            }
        }
        return ans;     
    }
    
}
