// Last updated: 31/07/2025, 21:16:50
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alpha = new int[26];
        for(char i:magazine.toCharArray()){
            ++alpha[i - 'a'];
        }
        for(char i:ransomNote.toCharArray()){
            --alpha[i - 'a'];
            if(alpha[i-'a'] <0) {
                return false;
            }
        }
        return true;
    }
}