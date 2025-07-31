// Last updated: 31/07/2025, 21:15:23
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int l=bits.length;
        if(l<2)
        {
            return true;
        }
        int currentind=0;
        while(currentind<l-1)
        {
            if(bits[currentind]==1)
            {
                currentind+=2;
            }
            else
            {
                currentind++;
            }
        }
        return currentind==l-1;
    }
}