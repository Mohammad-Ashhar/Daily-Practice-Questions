// Last updated: 31/07/2025, 21:19:10
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int ind=s.lastIndexOf(' ');
        String ans=s.substring(ind+1);
        return ans.length();
    }
}