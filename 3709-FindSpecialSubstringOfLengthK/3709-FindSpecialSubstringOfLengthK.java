// Last updated: 31/07/2025, 21:04:26
class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int n = s.length();
        for (int i = 0; i <= n - k; i++) {
            char ch = s.charAt(i);
            boolean sub = true;
            for (int j = i + 1; j < i + k; j++) {
                if (s.charAt(j) != ch) {
                    sub = false;
                    break;
                }
            }
            if (!sub) {
                continue;
            }
            if (i > 0 && s.charAt(i - 1) == ch) {
                continue;
            }
            if (i + k < n && s.charAt(i + k) == ch) {
                continue;
            }
            
            return true;
        }
        return false;
        
    }
}