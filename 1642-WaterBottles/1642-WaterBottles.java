// Last updated: 31/07/2025, 21:11:43
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int tot=numBottles;
        while(numBottles>=numExchange)
        {
            int q=numBottles/numExchange;
            int r=numBottles%numExchange;
            tot+=q;
            numBottles=q+r;
        }
        return tot;
        
    }
}