// Last updated: 31/07/2025, 21:08:30
class Solution {
    public String smallestNumber(String pattern) {
        return construct_smallest_number(pattern);  
    }
    public static String construct_smallest_number(String s)
    {
        int[] ans=new int[s.length()+1];
        int count=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=s.length();i++)
        {
            if(i==s.length() || s.charAt(i)=='I')
            {
                ans[i]=count+1;
                count++;
                while(!st.isEmpty())
                {
                    ans[st.pop()]=count+1;
                    count++;
                }
                
            }
            else
            {
                st.push(i);
            }
        }
        String str="";
        for(int v:ans)
        {
            str+=v;
        }
        return str;
    }
}