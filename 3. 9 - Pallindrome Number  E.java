class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0)
            return false;
        
        int digit = 0, reverse = 0;
        int temp = x;
        
        while(temp != 0){
            digit = temp % 10;
            temp = temp/10;
            reverse = reverse* 10 + digit;
        }
        
        return x == reverse;
    }
}
