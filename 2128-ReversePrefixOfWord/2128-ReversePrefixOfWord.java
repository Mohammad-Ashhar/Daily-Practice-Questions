// Last updated: 31/07/2025, 21:09:58
class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                idx=i;
                break;
            }
        }
        Stack<Character>st=new Stack<>();
        for(int i=0;i<=idx;i++)
        {
            st.push(word.charAt(i));
        }
        String s="";
        for(int i=0;i<=idx;i++)
        {
            char c=st.pop();
            s+=c;
        }
        s+=word.substring(idx+1);
        return s;
        
    }
}