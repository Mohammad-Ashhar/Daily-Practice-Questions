// Last updated: 31/07/2025, 21:11:26
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int totalSubarrays = (i + 1) * (n - i);
            int oddSubarrays = (totalSubarrays + 1) / 2;
            sum += oddSubarrays * arr[i];
        }
        
        return sum;
    }
}