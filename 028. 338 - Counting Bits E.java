// Problem link - https://leetcode.com/problems/counting-bits/

// Optimal

class Solution {
    
    private int count(int x,int[] arr){
        if(x==0) return 0;
        
        if(x == 1) return 1;
        
        if(arr[x] != 0) return arr[x];
        
        if(x % 2 == 0) {
            arr[x] = count(x/2,arr);
            return arr[x];
        }
        
        else{
            arr[x] = 1 + count(x/2,arr);
            return arr[x];
        }
        
    }
    
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        
        for(int i=0;i<=n;i++){
            arr[i] = count(i,arr);
        }
        
        return arr;
    }
}


// Brute force

// class Solution {
//     public int[] countBits(int n) {
//         int[] arr = new int[n+1];
        
//         arr[0] = 0;
//         int count = 0;
        
//         for(int i=1;i<=n;i++){
//             int j = i;
//             count = 0;
//             while( j != 0){ 
//                 if(j%2==1)
//                     count++;
//                 j = j/2;
//             }
//             arr[i] = count;
//         }
        
//         return arr;
//     }


