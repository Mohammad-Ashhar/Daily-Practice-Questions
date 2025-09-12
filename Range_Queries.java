import java.util.*;
public class Range_Queries{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++) A[i]=sc.nextInt();
        int q=sc.nextInt();
        int[][] queries=new int[q][3];
        for(int i=0;i<q;i++)
        {
            for(int j=0;j<3;j++) queries[i][j]=sc.nextInt();
        }
        int mod=1000000007;
        int sum=0;
        for(int[] arr:queries)
        {
            if(arr[0]==1)
            {
                for(int i=arr[1];i<=arr[2];i++)
                {
                    A[i]=(i-arr[1]+1)*A[arr[1]];
                }
            }
            else
            {
                for(int i=arr[1];i<=arr[2];i++)
                {
                    sum+=(A[i]%mod);
                }
            }
        }
        System.out.println(sum%mod);
    }
}