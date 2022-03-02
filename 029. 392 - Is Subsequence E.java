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
             
          if(i < s.length())  {
            if(s.charAt(i) != t.charAt(j)){
                j++;
            } else if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            } 
          }else{
              return true;
          }
               
        }
        
        if(i == s.length() && j == t.length())
            return true;
        else
            return false;
    }
}
