// This question is the same as 476: https://leetcode.com/problems/number-complement/

// https://leetcode.com/problems/complement-of-base-10-integer/

class Solution {
    public int bitwiseComplement(int N) {
        int X = 1;
        while (N > X)
            X = X * 2 + 1;
        
        return X - N;
    }
}
