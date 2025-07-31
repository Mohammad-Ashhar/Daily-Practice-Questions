// Last updated: 31/07/2025, 21:05:03
class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=1;
        }
        for(int i=1;i<=k;i++)
        {
            for(int j=1;j<n;j++)
            {
                arr[j]=(arr[j]+arr[j-1])%1000000007;
            }
        }
        return arr[n-1];
        
    }
}