// Last updated: 31/07/2025, 21:16:41
class Solution {
    public int longestPalindrome(String s) {
        int[] charCounts = new int[128];
        for (char c : s.toCharArray()) {
            charCounts[c]++;
        }
        int sum = 0;
        boolean oddFreq = false;
        for (int freq : charCounts) {
            if (freq % 2 == 0) {
                sum += freq;
            } else {
                sum += (freq - 1);
                oddFreq = true;
            }
        }
        return oddFreq ? sum + 1 : sum;
    }
}