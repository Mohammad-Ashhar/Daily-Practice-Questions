// Last updated: 31/07/2025, 21:16:15
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String sb= s.substring(1,s.length())+ s.substring(0,s.length()-1);
        return sb.contains(s);
    }
}