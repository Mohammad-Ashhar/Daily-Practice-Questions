// Last updated: 31/07/2025, 21:04:10
class Solution {
    public int longestPalindrome(String s, String t) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    ans = Math.max(ans, sub.length());
                }
            }
        }
        for (int i = 0; i < t.length(); i++) {
            for (int j = i; j < t.length(); j++) {
                String sub = t.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    ans = Math.max(ans, sub.length());
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String subS = s.substring(i, j + 1);
                for (int k = 0; k < t.length(); k++) {
                    for (int l = k; l < t.length(); l++) {
                        String subT = t.substring(k, l + 1);
                        String candidate = subS + subT;
                        if (isPalindrome(candidate)) {
                            ans = Math.max(ans, candidate.length());
                        }
                    }
                }
            }
        }
        
        return ans;
    }
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}