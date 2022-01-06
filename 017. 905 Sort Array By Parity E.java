// Time complexity - O(n)
// Space complexity - O(1)

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int low = 0;
        int high = nums.length - 1;
        
        while(low < high){
             if(nums[low] % 2 > nums[high] % 2){
                nums[low] = nums[high] + nums[low];
                nums[high] = nums[low] - nums[high];
                nums[low] = nums[low] - nums[high];
                
            }
           if(nums[low] % 2 == 0)
               low++;
            if(nums[high] % 2 != 0)
                high--;
           
            
        }
       
        return nums;
        
    }
}

// space - O(n)

//  int[] result = new int[nums.length];
//         int index = 0;
        
//         for(int i = 0; i < nums.length;i++){
//             if(nums[i] % 2 == 0){
//                 result[index] = nums[i];
//                 index++;
//             }
//         }
        
//          for(int i = 0; i < nums.length;i++){
//             if(nums[i] % 2 != 0){
//                 result[index] = nums[i];
//                 index++;
//             }
//         }
        
//         return result;
