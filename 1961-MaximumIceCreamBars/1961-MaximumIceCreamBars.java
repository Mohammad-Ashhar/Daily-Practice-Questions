// Last updated: 31/07/2025, 21:10:28
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int index=0,ice=0;
        while(index<costs.length && coins>=costs[index])
        {
            coins-=costs[index];
            ice++;
            index++;
        }
        return ice;
        
    }
}