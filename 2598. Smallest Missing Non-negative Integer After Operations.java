class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] freq=new int[value];
        for(int num:nums)
        {
            int n=((num%value)+value)%value;
            freq[n]++;
        }
        int idx=0;
        while(true)
        {
            int n=idx%value;
            if(freq[n]==0) return idx;
            freq[n]--;
            idx++;
        }        
    }
}