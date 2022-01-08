// Problem link - https://leetcode.com/problems/3sum/




// Brute force O(n^3 + nlogn) == O(n^3)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
        HashSet<List<Integer>> set = new HashSet();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2;i++){
            for(int j=i + 1;j < nums.length - 1;j++){
                for(int k= j + 1;k < nums.length;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        
        List<List<Integer>> list = new ArrayList(set);
        return list;
        
    }
}
