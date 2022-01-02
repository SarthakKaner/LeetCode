// O(1) space

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];
        result[0] = 1;
        
        for(int i=1; i < nums.length; i++){
            result[i] = nums[i - 1] * result[i - 1]; 
        }
        
        int right = 1;
        
        for(int i=nums.length - 1; i >= 0; i--){
            result[i] = result[i]  *  right; 
            right *= nums[i];     
        }

        return result;
        
    }
}

// Optimal

/*

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];
        
        int[] left_right = new int[nums.length];
        left_right[0] = 1;
        
        int[] right_left = new int[nums.length];
        right_left[nums.length - 1] = 1;
        int pointer = 1;
        
        for(int i=0; i < nums.length - 1; i++){
            left_right[pointer] = nums[i] * left_right[i]; 
            pointer++;
        }
        
        pointer = nums.length - 2;
          for(int i=nums.length - 1; i > 0; i--){
            right_left[pointer] = nums[i] * right_left[i]; 
            pointer--;
        }
        
         for(int i=0; i < nums.length; i++){
            result[i] = left_right[i] * right_left[i]; 
        }
        
        return result;
        
    }
}

*/

// Brute force - TLE
    // for(int i=0; i < nums.length; i++){
    //         for(int j=0; j < nums.length; j++){
    //             if(i != j){
    //                 arr[pointer] *= nums[j];   
    //             }
    //         }
    //         pointer++;
    //     }

// O(n) but with division

//   for(int i=0; i < nums.length; i++){
//             product *= nums[i];
//         }
        
//         for(int i = 0; i < nums.length;i++){
//             if(product == 0){
                
//             }else
//                 arr[i] = product / nums[i]; 
//         }
