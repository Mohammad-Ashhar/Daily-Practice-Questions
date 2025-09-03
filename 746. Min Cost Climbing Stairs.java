class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // top is the length of array
        int dp1=0;
        int dp2=0;
        for(int i=2;i<=cost.length;i++)
        {
            int curr=Math.min(dp1+cost[i-1],dp2+cost[i-2]);
            dp2=dp1;
            dp1=curr;
        }
        return dp1;
    }
}