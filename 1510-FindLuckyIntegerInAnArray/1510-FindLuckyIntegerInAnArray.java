// Last updated: 31/07/2025, 21:12:30
class Solution {
    public int findLucky(int[] arr) {
        int[] freq=new int[501];
        for(int n:arr)
        {
            freq[n]++;
        }
        int max=-1;
        for(int i=1;i<501;i++)
        {
            if(freq[i]==i)
            {
                max=i;
            }
        }
        return max;
        
    }
}