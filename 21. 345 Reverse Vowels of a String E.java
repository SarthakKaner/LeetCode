// Problem link - https://leetcode.com/problems/reverse-vowels-of-a-string/

class Solution {
    public String reverseVowels(String s) {
        
        HashSet<Character> set = new HashSet<>();
                                           
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
                                          
        
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        
        
        while(i < j){
            
            while(i < j && !set.contains(arr[i])){
                i++;
            }
            while(i < j && !set.contains(arr[j])){
                j--;
            }
            
                char temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
                
        }
                                           
        String str = String. valueOf(arr);
        
        return str;                                     
        
    }
}
