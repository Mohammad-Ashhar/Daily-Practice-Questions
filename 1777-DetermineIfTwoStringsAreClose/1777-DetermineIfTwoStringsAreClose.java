// Last updated: 31/07/2025, 21:11:05
class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] freqs=new int[26];
        int[] freqt=new int[26];
        for(char ch:word1.toCharArray())
        {
            freqs[ch-'a']++;
        }
        for(char ch:word2.toCharArray())
        {
            freqt[ch-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if((freqs[i]>0) != (freqt[i]>0))
            {
                return false;
            }
        }
        Arrays.sort(freqs);
        Arrays.sort(freqt);
        return Arrays.equals(freqs,freqt);
    }
}