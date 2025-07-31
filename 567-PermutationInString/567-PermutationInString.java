// Last updated: 31/07/2025, 21:15:46
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26]; 
        int[] windowCount = new int[26]; 
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int l = s1.length();
        for (int i = 0; i < l; i++) {
            windowCount[s2.charAt(i) - 'a']++;
        }
        if (matches(s1Count, windowCount)) {
            return true;
        }
        for (int i = l; i < s2.length(); i++) {
            windowCount[s2.charAt(i) - 'a']++;
            windowCount[s2.charAt(i - l) - 'a']--;
            if (matches(s1Count, windowCount)) {
                return true;
            }
        }

        return false;
    }
    public boolean matches(int[] s1Count, int[] windowCount) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != windowCount[i]) {
                return false;
            }
        }
        return true;
    }
}
