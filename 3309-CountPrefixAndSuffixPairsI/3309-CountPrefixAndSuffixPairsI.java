// Last updated: 31/07/2025, 21:05:48
class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int l=words.length;
        int c=0;
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                int l1=words[i].length();
                int l2=words[j].length();
                if(l1<=l2)
                {

                
                    if(words[i].equals(words[j].substring(0,l1)) && words[i].equals(words[j].substring(l2-l1)))
                {
                    c++;
                }
            }
        }
        }
    return c;
        
    }
}