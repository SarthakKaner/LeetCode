class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        int[] arr = new int[nums.length];
        int sum = 0;
        
        if(nums.length < 3){
            return 0;
        }
        
        for(int i=2;i<nums.length;i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                arr[i] = arr[i-1] + 1;
            }
        }
        
        for(int i=0;i < arr.length;i++){
            sum += arr[i];
        }
        
        return sum;
    }
}
