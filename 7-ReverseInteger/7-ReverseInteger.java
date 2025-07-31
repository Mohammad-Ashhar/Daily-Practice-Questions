// Last updated: 31/07/2025, 21:20:11
class Solution {
    public int reverse(int x) {
        boolean neg = x < 0;
        int ax = Math.abs(x);  
        String rev = new StringBuilder(Integer.toString(ax)).reverse().toString();
        try {
            int num = Integer.parseInt(rev);
            return neg ? -num : num;  
        } catch (NumberFormatException e) {
            return 0;  
        }
    }
}
