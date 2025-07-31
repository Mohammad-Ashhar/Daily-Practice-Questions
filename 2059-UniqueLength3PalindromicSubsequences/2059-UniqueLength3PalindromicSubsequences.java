// Last updated: 31/07/2025, 21:10:10
class Solution {
    public int countPalindromicSubsequence(String s) {
        int left[]=new int[26];
        int right[]=new int[26];
        Set<String> uniquePalindromes = new HashSet<>();
        for(char ch:s.toCharArray())
        {
            right[ch-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            char middle=s.charAt(i);
            right[middle-'a']--;
            for(char ch='a';ch<='z';ch++)
            {
                if(left[ch-'a']>0 && right[ch-'a']>0)
                {
                    uniquePalindromes.add(ch + "" + middle + ch);
                }
            }
            left[middle-'a']++;
        }
        return uniquePalindromes.size();
        
    }
}