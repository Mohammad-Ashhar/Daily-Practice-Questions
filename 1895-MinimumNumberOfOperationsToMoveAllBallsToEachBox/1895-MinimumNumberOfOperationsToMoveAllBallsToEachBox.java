// Last updated: 31/07/2025, 21:10:40
class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int balls=0,moves=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=moves;
            if(boxes.charAt(i)=='1')
            {
                balls++;
            }
            moves+=balls;
        }
        moves=balls=0;
        for(int i=n-1;i>=0;i--)
        {
            ans[i]+=moves;
            if(boxes.charAt(i)=='1')
            {
                balls++;
            }
            moves+=balls;
        }
        return ans;
        
    }
}