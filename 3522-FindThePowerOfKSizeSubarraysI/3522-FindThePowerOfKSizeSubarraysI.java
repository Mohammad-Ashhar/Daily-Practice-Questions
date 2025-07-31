// Last updated: 31/07/2025, 21:04:39
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int result[]=new int[n-k+1];
        for(int i=0;i<=n-k;i++)
        {
            boolean isCons=true;
            int max=nums[i];
            for(int j=i;j<i+k-1;j++)
            {
                if(nums[j+1]!=nums[j]+1)
                {
                    isCons=false;
                    break;
                }
                max=Math.max(max,nums[j+1]);
            }
            result[i]=isCons?max:-1;
        }
        return result;
    }
}