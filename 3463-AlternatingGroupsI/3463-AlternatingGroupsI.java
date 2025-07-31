// Last updated: 31/07/2025, 21:04:49
class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count=0;
        int prev=colors[colors.length-1];

        for(int i=0;i<colors.length-1;i++)
        {
            if(prev!=colors[i]&&colors[i]!=colors[i+1])
            count++;
            prev=colors[i];
        }
         if(prev!=colors[colors.length-1]&&colors[colors.length-1]!=colors[0])
         count++;
         return count;
    }
}