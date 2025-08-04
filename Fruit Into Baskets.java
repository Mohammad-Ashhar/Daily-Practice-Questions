class Solution {
    public int totalFruit(int[] fruits) {
        int t1 = -1, t2 = -1;
        int lf = -1;
        int lc = 0;
        int cl = 0;
        int max = 0;
        for (int fruit : fruits) {
            if (fruit == t1 || fruit == t2) {
                cl++;
            } else {
                cl = lc + 1; 
            }
            if (fruit == lf) {
                lc++;
            } else {
                lc = 1;
            }
            if (fruit != t1 && fruit != t2) {
                t1 = lf;
                t2 = fruit;
            }
            lf = fruit;
            max = Math.max(max, cl);
        }
        return max;
        
    }
}