// Last updated: 31/07/2025, 21:11:53
class Solution {
    public int xorOperation(int n, int start) {
        int xor=0;
        for(int i=0;i<n;i++)
        {
            int num=start+2*i;
            xor=xor^num;
        }
        return xor;
        
    }
}