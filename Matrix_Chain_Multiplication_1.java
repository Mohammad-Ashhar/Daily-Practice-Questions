import java.util.*;
public class Matrix_Chain_Multiplication_1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++) arr[i]=sc.nextInt();
         int[][] dp=new int[arr.length][arr.length];
         System.out.println(MCM(arr,0,arr.length-1,dp));
    }
    public static int MCM(int[] arr,int i,int j,int[][] dp)
    {
        if(i+1==j) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int ans=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            int fs=MCM(arr,i,k,dp);
            int ss=MCM(arr,k,j,dp);
            int self=arr[i]*arr[k]*arr[j];
            ans=Math.min(ans,fs+ss+self);
        }
        return dp[i][j]=ans;
    }
}