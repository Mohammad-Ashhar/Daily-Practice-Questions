// Last updated: 31/07/2025, 21:14:08
public class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int ans = check(tops[0], tops, bottoms);
        if (ans != -1 || tops[0] == bottoms[0]) {
            return ans;
        }
        return check(bottoms[0], tops, bottoms);
    }
    private int check(int x, int[] tops, int[] bottoms) {
        int rotateTop = 0;   
        int rotateBottom = 0;
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != x && bottoms[i] != x) {
                return -1;
            }
            
            if (tops[i] != x) rotateTop++;
            if (bottoms[i] != x) rotateBottom++;
        }
        return Math.min(rotateTop, rotateBottom);
    }
}
