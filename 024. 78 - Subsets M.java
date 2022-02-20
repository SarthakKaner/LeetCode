// Problem Link - https://leetcode.com/problems/subsets/


class Solution {
    
    private void sub(int index, ArrayList<Integer> list, int[] arr, int n, List<List<Integer>> ans){
        if(index == n){
            ans.add(new ArrayList(list));
            return;
        }
        
        list.add(arr[index]); 
        sub(index + 1,list,arr,n,ans); // pick
        list.remove(list.size() - 1);
        sub(index + 1,list,arr,n,ans); // not pick
        
    }
    
    public List<List<Integer>> subsets(int[] nums) {
      
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        sub(0,list,nums,nums.length,ans); 
        
        return ans;
        
    }
}
