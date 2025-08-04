class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans=new StringBuilder();
        int prev=0;
        for(int index:spaces)
        {
            ans.append(s,prev,index).append(' ');
            prev=index;
        }
        ans.append(s.substring(prev));
        return ans.toString();
        
    }
}