class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max_sum = -10000;
        
        for(int i=0;i < nums.length;i++){
            sum += nums[i];
            
            if(nums[i] > sum){
                sum = nums[i];
            }
            
            if(sum > max_sum){
                max_sum = sum;
            }
        }
        return max_sum;
    }
}

