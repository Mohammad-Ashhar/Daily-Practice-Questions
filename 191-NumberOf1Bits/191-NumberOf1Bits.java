// Last updated: 31/07/2025, 21:18:02
class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n>0)
        {
            if(n%2==1)
            {
                c++;
            }
            n/=2;
        }
        
        return c;
    }
}