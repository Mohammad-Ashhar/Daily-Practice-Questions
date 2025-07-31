// Last updated: 31/07/2025, 21:18:34
class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int p:prices)
        {
            if(p<min)
            {
                min=p;
            }
            int profit=p-min;
            max=Math.max(max,profit);
        }
        return max;
    }
}