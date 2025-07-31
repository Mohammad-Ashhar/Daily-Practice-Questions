// Last updated: 31/07/2025, 21:10:58
class Solution {
    public int minPartitions(String n) {
        int val=Integer.MIN_VALUE;
        for(char ch:n.toCharArray())
        {
            val=Math.max(val,ch-'0');
        }
        return val;
        
    }
}