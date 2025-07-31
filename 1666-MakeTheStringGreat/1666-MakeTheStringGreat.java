// Last updated: 31/07/2025, 21:11:33
class Solution {
    public String makeGood(String s) {
       int left = 0;
        char[] chars = s.toCharArray();
        for (int right = 0; right < chars.length; right++) {
            if (left > 0 && (chars[right] ^ chars[left-1]) == 32) {
                left--;
            } else {
                chars[left] = chars[right];
                left++;
            }
        }
        return new String(chars, 0, left);
        
    }
}