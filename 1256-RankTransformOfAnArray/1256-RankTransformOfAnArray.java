// Last updated: 31/07/2025, 21:13:31
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0)
            return arr;
        
        long[] a = new long[arr.length];
        for (int i = 0; i < arr.length; ++i)
            a[i] = ((long)arr[i] << 32) | i;
        
        Arrays.sort(a);
        
        int lastRang = 1;
        int lastNums = (int)(a[0] >> 32);
        for (int i = 0; i < a.length; ++i) {
            int b = (int)(a[i] >> 32);
            
            if (b != lastNums) {
                lastNums = b;
                ++lastRang;
            }
            
            arr[(int)a[i]] = lastRang;
        }
        
        return arr;

    }
}