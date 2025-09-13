class Solution {
    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        int n = arrivals.length;
        int maxv = 0;
        for (int num : arrivals) 
        {
            if (num > maxv) maxv = num;
        }
        int[] freq = new int[maxv + 1];
        boolean[] used = new boolean[n];
        int not= 0;
        for (int i = 0; i < n; i++) {
            if (i - w >= 0) {
                if (used[i - w]) freq[arrivals[i - w]]--;
            }
            int temp = arrivals[i];
            if (freq[temp] < m) {
                freq[temp]++;
                used[i] = true;
            } else {
                not++;
            }
        }
        return not;
    }
}
