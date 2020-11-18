class Solution {
    public boolean isPerfectSquare(int num) {
        
        if(num <= 1){
            return true;
        }
        int left  = 0;
        int right = num/2;
        double mid = 0;
        
        while(left<=right){
            mid = left+(right-left)/2;
            if(mid*mid > num){
                right = (int)mid-1;
            }
            else if(mid*mid<num){
                left = (int)left+1;
            }
            else{
                return true;
            }
        }
        
        return false;
    }
}
