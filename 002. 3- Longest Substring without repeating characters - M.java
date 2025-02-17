class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        if(s.length() == 1)
            return 1;
        
        HashSet<Character> set = new HashSet();
        int i=0,j=0,max = 0;
        
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
               set.add(s.charAt(j)) ; 
               max = Math.max(set.size(),max);
               j++;
            }else{
            set.remove(s.charAt(i));
            i++;
            }   
        }
        return max;
    }
}
