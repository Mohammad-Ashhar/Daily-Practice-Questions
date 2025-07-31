// Last updated: 31/07/2025, 21:14:04
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore=Integer.MIN_VALUE;
        int maxSoFar=values[0];
        for(int j=1;j<values.length;j++)
        {
            maxScore=Math.max(maxScore,maxSoFar+values[j]-j);
            maxSoFar=Math.max(maxSoFar,values[j]+j);
        }
        return maxScore;
        
    }
}