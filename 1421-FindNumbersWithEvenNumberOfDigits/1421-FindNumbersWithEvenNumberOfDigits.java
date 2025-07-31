// Last updated: 31/07/2025, 21:13:03
class Solution {
    public int findNumbers(int[] nums) {
        return countEveDig(nums);
    }
    private int countEveDig(int[] nums)
    {
        int evec=0;
        for(int num:nums)
        {
            int c=0;
            while(num!=0)
            {
                c++;
                num/=10;
            }
            if(c%2==0)
            {
                evec++;
            }
        }
        return evec;
    }
}