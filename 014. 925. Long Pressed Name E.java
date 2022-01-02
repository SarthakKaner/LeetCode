class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        if(name.length() > typed.length())
            return false;
        
        int i=0,j=0;
        while(j < typed.length()){
            if(i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
            }
            
            else if(name.charAt(0) != typed.charAt(0) || typed.charAt(j-1) != typed.charAt(j))             {
                return false;
            }
            j++;
        }
      
        return i == name.length();
        }
}
