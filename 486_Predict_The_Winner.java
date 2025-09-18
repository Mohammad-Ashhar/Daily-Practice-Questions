class Solution {
    public boolean predictTheWinner(int[] nums) {
        int[][] dp=new int[nums.length][nums.length];
        for(int[] a:dp) Arrays.fill(a,Integer.MIN_VALUE);
        return Winner(nums,0,nums.length-1,dp)>=0;
    }
    public int Winner(int[] arr,int i,int j,int[][] dp) {
        if(i==j) return arr[i];
        if(dp[i][j]!=Integer.MIN_VALUE) return dp[i][j];
        int left=arr[i]-Winner(arr,i+1,j,dp);
        int right=arr[j]-Winner(arr,i,j-1,dp);
        return dp[i][j]=Math.max(left,right);
    }
}
