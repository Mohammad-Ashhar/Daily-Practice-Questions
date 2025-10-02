class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drink=numBottles;
        int extra=0;
        while(drink>=numExchange)
        {
            drink-=numExchange;
            numExchange++;
            drink+=1;
            extra++;
        }
        return numBottles+extra;

    }
}