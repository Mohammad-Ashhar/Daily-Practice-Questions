// Last updated: 31/07/2025, 21:07:13
class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(String ele:details)
        {
            int tens=ele.charAt(11)-'0';
            int ones=ele.charAt(12)-'0';
            int ans=tens*10 +ones;
            if(ans>60)
            {
                c++;
            }
        }
        return c;
        
    }
}