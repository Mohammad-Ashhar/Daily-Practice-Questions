// Last updated: 31/07/2025, 21:07:09
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C=new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            C[i]=preCommon(A,B,i);
        }
        return C;
    }
    public static int preCommon(int[] A,int[] B,int ind)
    {
        int ans=0;
        for(int i=0;i<=ind;i++)
        {
            for(int j=0;j<=ind;j++)
            {
                if(A[i]==B[j])
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}