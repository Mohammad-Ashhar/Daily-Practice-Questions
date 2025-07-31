// Last updated: 31/07/2025, 21:05:18
class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
        {
            return false;
        }
        word=word.toLowerCase();
        String vowels     = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";
        int c=0,v=0,d=0;
        for(char ch:word.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                d++;
            }
            else if(vowels.indexOf(ch)>=0)
            {
                v++;
            }
            else if(consonants.indexOf(ch)>=0)
            {
                c++;
            }
        }
        if(c>=1 && v>=1 && c+v+d==word.length())
        {
            return true;
        }
        return false;        
    }
}