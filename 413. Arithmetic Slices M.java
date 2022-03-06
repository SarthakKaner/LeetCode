class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        if(nums.length < 3)
            return 0;
        
        int count = 0;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = 0;
        }
        
        
        for(int i=0;i<=nums.length - 3;i++){
            if(nums[i+1] - nums[i] == nums[i+2] - nums[i+1]){
                arr[i+2] = arr[i+1] + 1;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            count += arr[i] ;
        }
        
        return count;
    }
}
