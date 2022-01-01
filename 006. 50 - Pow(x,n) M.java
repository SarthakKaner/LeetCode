class Solution {
    public double myPow(double x, int n) {
        double answer = 1;
        if(n > 0){
            for(int i=0;i < n;i++){
                answer *= x;
            }
        }else{
            for(int i=0;i > n;i--){
                answer /= x;
            }
        }
    return answer;
    }
}

// pass 299/305 test cases - TLE :(
