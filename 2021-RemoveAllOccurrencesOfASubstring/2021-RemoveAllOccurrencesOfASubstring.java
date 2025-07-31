// Last updated: 31/07/2025, 21:10:18
class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part))
        {
            int first=s.indexOf(part);
            int last=first+part.length();
            s=s.substring(0,first)+s.substring(last);
        }
        return s;
        
    }
}