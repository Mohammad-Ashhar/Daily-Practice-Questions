// Last updated: 31/07/2025, 21:04:14
class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        int n = pizzas.length;
        int g = n / 4; 
        int odd=(g+1)/2;
        int eve=g-odd;
        int hco=2*g-odd;
        long total=0;
        for(int i=n-odd;i<n;i++)
        {
            total+=pizzas[i];
        }
        for(int i=n-hco;i<n-odd;i+=2)
        {
            total+=pizzas[i];
        }
        return total;
    }
}