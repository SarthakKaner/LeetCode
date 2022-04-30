// Approach 1 - using hashset

class Solution {
    public int missingNumber(int[] nums) {
        
        int largest = -2;
        HashSet<Integer> set = new HashSet();
        
        for(int i = 0; i < nums.length; i++){
            largest = Math.max(largest,nums[i]);
            set.add(nums[i]);
        }
        int ans = largest;
        while(largest >= 0){
            if(!set.contains(largest))
                return largest;
            largest--;
        }
        return ans + 1;
    }
}

// Approach 2 - using sum

class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        
        int max_sum = ( n * (n+1) ) / 2;
        int sum = 0;
        
        for(int i = 0; i < n;i++){
            sum += nums[i];
        }
        
        return max_sum - sum ;
    }
}

// Approach 3 

class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int ans = 0;
        int i = 0;
        for(i = 0; i < n;i++){
            ans ^= i ^ nums[i] ;
        }
        
        return ans ^ i;
    }
}
