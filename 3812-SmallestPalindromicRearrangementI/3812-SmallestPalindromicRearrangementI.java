// Last updated: 31/07/2025, 21:04:04
class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        StringBuilder lHalf = new StringBuilder();
        String center = "";
        for (int i = 0; i < 26; i++) {
            int count = freq[i] / 2;
            for (int j = 0; j < count; j++) {
                lHalf.append((char)(i + 'a'));
            }
            if (freq[i] % 2 == 1 && center.isEmpty()) {
                center = String.valueOf((char)(i + 'a'));
            }
        }
        
        String rHalf = lHalf.reverse().toString();
        lHalf.reverse();
        
        return lHalf.toString() + center + rHalf;
    }
}