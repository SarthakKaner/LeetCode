// Problem link - https://leetcode.com/problems/3sum/

// Optimal solution
// scroll down for brute force

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
        HashSet<List<Integer>> set = new HashSet();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2;i++){
          if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
              int low = i + 1;
              int high = nums.length - 1;
              int sum = 0 - nums[i];
              
              
              while(low < high){
                  if(nums[low] + nums[high] == sum){
                      set.add(Arrays.asList(nums[i],nums[low],nums[high]));
                      
                      // Either use set.add or use list.add and perform below commented operations explicitly. Both the snipppets do same thing of only adding unique triplets.
                      
                      // while(low < high && nums[low] == nums[low + 1])low++;
                      // while(low < high && nums[high] == nums[high - 1])high--;
                      low++;
                      high--;
                  }
                  
                  else if(nums[low] + nums[high] > sum) {
                      high--;
                  }
                  else {
                      low++;
                  }
              }
          }
            
        }
        
        List<List<Integer>> list = new ArrayList(set);
        return list;
        
    }
}



// Brute force O(n^3 + nlogn) == O(n^3)

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
        
        
//         HashSet<List<Integer>> set = new HashSet();
//         Arrays.sort(nums);
        
//         for(int i = 0; i < nums.length - 2;i++){
//             for(int j=i + 1;j < nums.length - 1;j++){
//                 for(int k= j + 1;k < nums.length;k++){
//                     if(nums[i] + nums[j] + nums[k] == 0){
//                         set.add(Arrays.asList(nums[i],nums[j],nums[k]));
//                     }
//                 }
//             }
//         }
        
//         List<List<Integer>> list = new ArrayList(set);
//         return list;
        
//     }
// }
