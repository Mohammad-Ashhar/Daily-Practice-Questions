// Last updated: 31/07/2025, 21:15:03
class Solution {
    public String customSortString(String order, String s) {
        int[] freq=new int[26];
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        }
        StringBuilder result=new StringBuilder();
        for(char c:order.toCharArray())
        {
            int index=c-'a';
            while(freq[index]!=0)
            {
                result.append(c);
                freq[index]--;
            }
        }
        for(int i=0;i<26;i++)
        {
            while(freq[i]!=0)
            {
                result.append((char)(i+'a'));
                freq[i]--;
            }
        }
        return result.toString();
        
    }
}