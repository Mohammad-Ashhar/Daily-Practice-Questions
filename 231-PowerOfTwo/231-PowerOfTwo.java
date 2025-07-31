// Last updated: 31/07/2025, 21:17:41
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