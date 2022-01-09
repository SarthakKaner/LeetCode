// https://leetcode.com/problems/3sum-closest/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int result = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        
        for(int i=0; i < nums.length;i++){
            int low = i + 1;
            int high = nums.length - 1;
            
            while(low < high){
                int current_sum = nums[i] + nums[low] + nums[high];
                if(current_sum > target){
                    high--;
                }else{
                    low++;
                }
                
                if(Math.abs(current_sum - target) < Math.abs(result - target)){
                    result = current_sum;
                }
                
            }
        }
        return result;
    }
}
