class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int currMax=0;
            for(int j=1;j<=k && i-j+1>=0;j++)
            {
                currMax=Math.max(currMax,arr[i-j+1]);
                int prev=(i-j>=0)?dp[i-j]:0;
                dp[i]=Math.max(dp[i],prev+currMax*j);
            }
        }
        return dp[arr.length-1];
        
    }
}