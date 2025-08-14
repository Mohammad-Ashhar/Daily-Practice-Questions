class Solution {
    public String largestGoodInteger(String num) {
        List<String>ll=new ArrayList<>();
        for(int i=0;i<num.length()-2;i++)
        {
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2))
            {
                ll.add(num.substring(i,i+3)); 
            }
        }
        int max=Integer.MIN_VALUE;
        String s="";
        for(int i=0;i<ll.size();i++)
        {
            int ans=Integer.parseInt(ll.get(i));
            if(ans>max)
            {
                s=ll.get(i);
                max=ans;
            }
        }
        return s;
        
        
    }
}