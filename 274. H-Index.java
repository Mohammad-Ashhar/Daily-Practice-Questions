class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int[] freq=new int[n+1];
        for(int c:citations)
        {
            if(c>=n) freq[n]++;
            else freq[c]++;
        }
        int cited=0;
        for(int i=n;i>=0;i--)
        {
            cited+=freq[i];
            if(cited>=i) return i;
        }
        return 0;
    }
}