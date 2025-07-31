// Last updated: 31/07/2025, 21:12:01
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int i=0;
        for(String s:sentence.split(" "))
        {
            if(s.length()>=searchWord.length())
            {
                String p=s.substring(0,searchWord.length());
                if(p.equals(searchWord))
                {
                    return i+1;
                }
            }
            i++;
        }
        return -1;
        
    }
}