class Solution {
    public int mySqrt(int x) {
        int index =0;
        
        if(x<=1){
            return x;
        }
        
        int left = 0;
        int right = x/2;
        double mid  = 0;
        
        while(left<=right){
            mid = left+(right-left)/2;
            double sq = mid*mid;
            if(sq ==x){
                return (int)mid;
            }
            
            if(x<sq){
                right = (int)mid-1;
            }
            else{
                left = (int)mid +1;
            }
        }
            
        return (int)right;
    }
}
