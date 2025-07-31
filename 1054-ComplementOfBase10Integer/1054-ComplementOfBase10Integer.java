// Last updated: 31/07/2025, 21:14:06
class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)
        {
            return 1;
        }
        int mask=1;
        while(mask<n)
        {
            mask=(mask<<1)|1;
        }
        return n^mask;
    }
}