class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        int prev=0;
        for(String b:bank)
        {
            int curr=0;
            for(int i=0;i<b.length();i++)
            {
                if(b.charAt(i)=='1') curr++;
            }
            if(curr>0)
            {
                ans+=prev*curr;
                prev=curr;
            }
        }
        return ans;
        
    }
}