class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n=nums.length;
        if(n%k!=0) return false;
        int groupsSize=n/k;
        int[] freq=new int[100001];
        for(int num:nums)
        {
            freq[num]++;                
        }
        for(int f:freq)
            {
                if(f>groupsSize) return false;
            }
        return true;     
    }
}