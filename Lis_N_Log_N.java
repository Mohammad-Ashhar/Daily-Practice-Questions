public class Lis_N_Log_N{
    public static void main(String[] args){
        int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
    }
    public static int LIS(int[] arr)
    {
        int[] dp=new int[arr.length];
        int len=1;
        dp[0]=arr[0];
        for(int i=1;i<dp.length;i++)
        {
            if(arr[i]>dp[len-1])
            {
                dp[len]=arr[i];
                len++;
            }
            else{
                int idx=BinarySearch(dp,0,len-1,arr[i]);
                dp[idx]=arr[i];
            }
        }
        return len;
    }
    public int BinarySearch(int[] dp,int low,int high,int replace)
    {
        int idx=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(dp[mid]>=replace)
            {
                idx=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return idx;
    }
}