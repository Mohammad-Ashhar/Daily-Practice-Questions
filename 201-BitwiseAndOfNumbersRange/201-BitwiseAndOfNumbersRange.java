// Last updated: 31/07/2025, 21:17:59
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        while(left<right)
        {
            right= right & (right-1);
        }
        return right;
        
    }
}