class Solution {
    public long maxProduct(int[] nums) {
        int n=nums.length;
        int val=0;
        long max1=0,max2=0;
        for(int num:nums)
        {
            if(num!=0) val++;
            long a=Math.abs((long)num);
            if(a>max1)
            {
                max2=max1;
                max1=a;
            }
            else if(a>max2) max2=a;
        }
        if(val<2) return 0;
        return 100000*max1*max2;
        
    }
}