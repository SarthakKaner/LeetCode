class Solution {
    public int maxArea(int[] height) {
        int max_height = 0;
        
        int i=0, j = height.length - 1;
        
        while(i < j){
            if(height[i] < height[j]){
                max_height = Math.max(max_height, height[i] * (j - i));
                i++;
            }else{
                max_height = Math.max(max_height, height[j] * (j - i));
                j--;
            }
        }
        return max_height;
    }
}
