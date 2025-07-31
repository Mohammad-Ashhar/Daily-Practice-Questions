// Last updated: 31/07/2025, 21:13:47
class Solution {
    public void duplicateZeros(int[] arr) {
        int[] arr2 = arr.clone();
        int r = 0;
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            if (arr2[r] == 0 && i < l-1) {
                arr[i] = 0;
                arr[i+1] = 0;
                i++;
            }
            else {
                arr[i] = arr2[r];
            }
            r++;
        
    }
    }
}