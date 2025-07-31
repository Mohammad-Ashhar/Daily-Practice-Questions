// Last updated: 31/07/2025, 21:18:37
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String>res=new ArrayList<>();
        if(s.length()<4 || s.length()>12)
        {
            return res;
        }
        backtrack(s,0,new ArrayList<>(),res);
        return res;
    }
    private void backtrack(String s,int start,List<String>seg,List<String> res)
    {
        if(seg.size()==4)
        {
            if(start==s.length())
            {
                res.add(String.join(".",seg));
            }
            return;
        }
        for(int len=1;len<=3;len++)
        {
            if(start+len>s.length())
            {
                break;
            }
            String part=s.substring(start,start+len);
            if(part.startsWith("0") && part.length()>1)
            {
                continue;
            }
            int val=Integer.parseInt(part);
            if(val>255)
            {
                continue;
            }
            seg.add(part);
            backtrack(s,start+len,seg,res);
            seg.remove(seg.size()-1);
        }
    }
}