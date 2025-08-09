// Last updated: 09/08/2025, 08:33:09
class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<31;i++)
        {
            if(Math.pow(2,i)==n)
            {
                return true;
            }
        }
        return false;
        
    }
}