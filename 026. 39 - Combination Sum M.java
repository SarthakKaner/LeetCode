// Problem Link - https://leetcode.com/problems/combination-sum/

class Solution {
    
        private void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(ind == arr.length) {
            if(target == 0) {
                ans.add(new ArrayList<>(ds)); 
                return;
            }
            return; 
        }
        
        if(arr[ind] <= target) { // since same element can be picked any number of times
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds); //pick
            ds.remove(ds.size() - 1); 
        }
        findCombinations(ind + 1, arr, target, ans, ds); // not pick
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList();
        findCombinations(0, candidates, target, ans, ds); 
        return ans; 
    }
