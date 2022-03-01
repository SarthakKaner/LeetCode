// Problem link - https://leetcode.com/problems/counting-bits/

// Brute force

class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        
        arr[0] = 0;
        int count = 0;
        
        for(int i=1;i<=n;i++){
            int j = i;
            count = 0;
            while( j != 0){ 
                if(j%2==1)
                    count++;
                j = j/2;
            }
            arr[i] = count;
        }
        
        return arr;
    }
}


