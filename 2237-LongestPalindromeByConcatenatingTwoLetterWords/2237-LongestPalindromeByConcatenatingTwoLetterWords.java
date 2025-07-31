// Last updated: 31/07/2025, 21:09:25
class Solution {
    public int longestPalindrome(String[] words) {
        int[][] post = new int[26][26];
        int res = 0;
        for (String w : words) {
            int x = w.charAt(0) - 'a';
            int y = w.charAt(1) - 'a';
            if (post[y][x] > 0) {
                post[y][x]--;      
                res += 4;
            } else {
                post[x][y]++;      
            }
        }
        for (int i = 0; i < 26; i++) {
            if (post[i][i] > 0) {
                res += 2;
                break;            
            }
        }
        return res;
    }
}
