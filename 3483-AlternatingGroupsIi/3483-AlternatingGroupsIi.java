// Last updated: 31/07/2025, 21:04:42
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        if(k<=1)
        {
            return n;
        }
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (colors[i] != colors[(i + 1) % n]) ? 1 : 0;
        }
        int l = 2 * n;
        int[] b = new int[l];
        for (int i = 0; i < l; i++) {
            b[i] = a[i % n];
        }
        int[] p = new int[l + 1];
        p[0] = 0;
        for (int i = 0; i < l; i++) {
            p[i + 1] = p[i] + b[i];
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            int s = p[i + k - 1] - p[i];
            if (s == k - 1) {
                count++;
            }
        }
        
        return count;
        }
    }