// Last updated: 31/07/2025, 21:15:01
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;
        }
        String news=s+s;
        return news.contains(goal);
        
    }
}