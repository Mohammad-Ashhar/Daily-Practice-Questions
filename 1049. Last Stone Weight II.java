class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum=0;
        for(int stone:stones) sum+=stone;
        int[][] dp=new int[stones.length+1][sum+1];
        for(int[] a:dp) Arrays.fill(a,-1);
        return fun(stones,0,0,sum,dp);        
    }
    public int fun(int[] stones,int i,int curr,int sum,int[][] dp)
    {
        if(i==stones.length) return Math.abs(sum-2*curr);
        if(dp[i][curr]!=-1) return dp[i][curr];
        int np=fun(stones,i+1,curr,sum,dp);
        int p=fun(stones,i+1,curr+stones[i],sum,dp);
        return dp[i][curr]=Math.min(np,p);
    }
}