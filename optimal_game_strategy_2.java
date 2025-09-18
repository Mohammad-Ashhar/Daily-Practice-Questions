import java.util.*;

public class optimal_game_strategy_2 {
    public static void main(String[] args) {
        int[] arr={2,3,1,4};
        int n=arr.length;
        int[][] dp=new int[n][n];
        for(int[] a:dp) Arrays.fill(a,-1);
        System.out.println(OGS2(arr,0,n-1,dp));
    }
    public static int OGS2(int[] arr,int i,int j,int[][] dp) {
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(i==j) return dp[i][j]=arr[i];
        if(i+1==j) return dp[i][j]=Math.max(arr[i],arr[j]);
        int f=arr[i]+Math.min(OGS2(arr,i+2,j,dp),OGS2(arr,i+1,j-1,dp));
        int s=arr[j]+Math.min(OGS2(arr,i+1,j-1,dp),OGS2(arr,i,j-2,dp));
        return dp[i][j]=Math.max(f,s);
    }
}
