// Problem link - https://leetcode.com/problems/is-subsequence/

// brute force approach will be to find all the subsequences using recursion and then check if the specified string exist or not.

class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i = 0;
        int j = 0;
        
        if(s.length() == 0){
            return true;
        }
        
        
        while(j < t.length()){
             
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;   
                if(i == s.length())
                    return true;
            } else{
                j++;
            } 
          }       

            return false;
    }
}
