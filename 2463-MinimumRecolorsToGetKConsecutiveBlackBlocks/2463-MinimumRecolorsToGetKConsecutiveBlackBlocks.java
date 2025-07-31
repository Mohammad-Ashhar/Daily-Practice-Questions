// Last updated: 31/07/2025, 21:08:27
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length()-k;i++)
        {
            white=0;
            for(int j=i;j<i+k;j++)
            {
                if(blocks.charAt(j)=='W')
                {
                    white++;
                }
            }
            min=Math.min(min,white);
        }
        return min;
    }
}