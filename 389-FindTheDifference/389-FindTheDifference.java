// Last updated: 31/07/2025, 21:16:44
class Solution {
    public char findTheDifference(String s, String t) {
        char[] ch1=s.toCharArray();
        Arrays.sort(ch1);
        char[] ch2=t.toCharArray();
        Arrays.sort(ch2);
        String s1=new String(ch1);
        String s2=new String(ch2);
        char c='a';
        int i=0;
        for(i=0;i<s2.length()-1;i++)
        {
            c=s2.charAt(i);
            if(s1.charAt(i)!=c)
            {
                return c;
            }
        }
        return s2.charAt(i);   
    }

}