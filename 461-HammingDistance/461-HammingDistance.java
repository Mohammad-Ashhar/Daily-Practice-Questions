// Last updated: 31/07/2025, 21:16:13
class Solution {
    public int hammingDistance(int x, int y) {
        int xor_val=x^y;
        int count=0;
        while(xor_val>0){
            xor_val=xor_val & (xor_val-1);
            count+=1;
        }
        return count;
        
    }
}