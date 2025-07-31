// Last updated: 31/07/2025, 21:18:05
class Solution {
    public int titleToNumber(String columnTitle) {
        int n=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            n*=26;
            n+=(columnTitle.charAt(i)-'A')+1;
        }
        return n;
    }
}