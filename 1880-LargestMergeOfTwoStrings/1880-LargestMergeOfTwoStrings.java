// Last updated: 31/07/2025, 21:10:45
class Solution {
    public String largestMerge(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int i=0,j=0;
        StringBuilder ans=new StringBuilder();
        while(i<n1 && j<n2)
        {
            if(word1.substring(i).compareTo(word2.substring(j))>0)
            {
                ans.append(word1.charAt(i));
                i++;
            }
            else
            {
                ans.append(word2.charAt(j));
                j++;
            }
        }
        if(i!=n1)  ans.append(word1.substring(i));
        if(j!=n2)  ans.append(word2.substring(j));
        return ans.toString();
            
        
    }
}