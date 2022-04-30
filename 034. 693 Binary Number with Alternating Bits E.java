// https://leetcode.com/problems/binary-number-with-alternating-bits/

class Solution {
    public boolean hasAlternatingBits(int n) {
        
        int prev1 = 0;
        int prev2 = 0;
        
        while(n != 0){
            prev1 = n%2;
            n /= 2;
            prev2 = n%2;
            
            if(prev1 == prev2)
                return false;
        }
        
        return true;
    }
}
