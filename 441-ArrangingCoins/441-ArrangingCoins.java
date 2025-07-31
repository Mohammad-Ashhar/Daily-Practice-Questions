// Last updated: 31/07/2025, 21:16:25
class Solution {
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        long middle;
        long answer = 0;
        long sum = 0;
        int solution = 0;
        while(start <= end)
        {
            middle = start + (end - start) / 2;
            sum = middle * (middle + 1) / 2;
            if(sum > n)
            {
                end = middle - 1;
            }
            else if(sum < n)
            {
                start = middle + 1;
            }
            else if(sum == n)
            {
                answer = middle;
                break;
            }

        }
        if(sum != n)
        {
            answer = end;
        }
        solution = (int) answer;
        return solution;
    }
}