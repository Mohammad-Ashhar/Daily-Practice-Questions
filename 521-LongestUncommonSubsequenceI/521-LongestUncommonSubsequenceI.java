// Last updated: 31/07/2025, 21:15:56
class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b))
        {
            return -1;
        }
        int l1=a.length();
        int l2=b.length();
        return Math.max(l1,l2);
        
    }
}