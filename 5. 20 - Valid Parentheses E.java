class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else if(st.isEmpty()){
                    return false;
            }else{
                char popped_element = st.pop();
                if(popped_element == '(' && s.charAt(i) != ')'){
                    return false;
                }
                else if(popped_element == '{' && s.charAt(i) != '}'){
                    return false;
                }else if(popped_element == '[' && s.charAt(i) != ']'){
                    return false;
                }
                }
            }
        
        if(st.isEmpty())
            return true;
        else  
            return false;
        
    }
}
