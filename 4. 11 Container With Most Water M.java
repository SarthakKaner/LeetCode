class Solution {
    public int maxArea(int[] height) {
        int max_height = 0;
        int start = 0, end = height.length - 1;
        
        while(start < end){
            if(height[start] < height[end]){
                max_height = Math.max(max_height,height[start] * (end - start));
                start++;
            }else{
                max_height = Math.max(max_height,height[end] * (end - start));
                end--;
            }
        }
        return max_height;
    }
}
