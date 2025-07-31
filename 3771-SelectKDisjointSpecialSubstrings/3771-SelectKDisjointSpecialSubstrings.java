// Last updated: 31/07/2025, 21:04:16
class Solution {
    public boolean maxSubstringLength(String s, int k) {
        int n = s.length();
        if (k == 0) return true;
        String copy = s;
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, n);
        Arrays.fill(last, -1);
        for (int i = 0; i < n; i++) {
            int letter = s.charAt(i) - 'a';
            first[letter] = Math.min(first[letter], i);
            last[letter] = Math.max(last[letter], i);
        }
        List<int[]> intervals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int letter = s.charAt(i) - 'a';
            if (i != first[letter]) continue; 

            int j = last[letter];
            int cur = i;
            boolean valid = true;
            while (cur <= j) {
                int curLetter = s.charAt(cur) - 'a';
                if (first[curLetter] < i) {
                    valid = false;
                    break;
                }
                j = Math.max(j, last[curLetter]);
                cur++;
            }
            if (!valid || (i == 0 && j == n - 1)) continue;
            intervals.add(new int[]{i, j});
        }
        intervals.sort((a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int lastEnd = -1;
        for (int[] interval : intervals) {
            if (interval[0] > lastEnd) { 
                count++;
                lastEnd = interval[1];
            }
        }

        return count >= k;
    }
}