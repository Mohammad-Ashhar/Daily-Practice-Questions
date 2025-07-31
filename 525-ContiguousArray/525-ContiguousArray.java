// Last updated: 31/07/2025, 21:15:53
class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int freq[] =new int[2*n+1];
        for(int i=0;i<freq.length;i++)
        {
            freq[i]=-9;
        }
        int offset=n;
        freq[offset]=-1;
        int c=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            c+=(nums[i]==1)?1:-1;
            int idx=c+offset;
            if(freq[idx]>=-1)
            {
                max=Math.max(max,i-freq[idx]);
            }
            else
            {
                freq[idx]=i;
            }
        }
        return max;    
    }
}