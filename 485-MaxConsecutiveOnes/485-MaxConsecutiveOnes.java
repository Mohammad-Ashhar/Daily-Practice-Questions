// Last updated: 31/07/2025, 21:16:11
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,m=0;
        for(int ele :nums)
        {
            if(ele==1)
            {
                c+=1;
                m=Math.max(m,c);
            }
            else
            {
                c=0;
            }
        }
        return m;
        
    }
}