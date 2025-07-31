// Last updated: 31/07/2025, 21:10:59
class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        int clock = customers[0][0];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int waitToTurn = 0;
            if (clock > customers[i][0]) {
                waitToTurn = clock - customers[i][0];
            } else
                clock = customers[i][0];
            clock += customers[i][1];
            sum += ((waitToTurn + customers[i][1]));
        }
        return sum / n;
    }
}