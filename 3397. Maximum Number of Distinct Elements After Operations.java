class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        long max=Long.MIN_VALUE;
        for(int num:nums)
        {
            long neg=(long)num-k;
            long pos=(long)num+k;
            if(max<pos)
            {
                long val=Math.max(max+1,neg);
                max=val;
                c++;
            }

        }
        return c;
        
    }
}