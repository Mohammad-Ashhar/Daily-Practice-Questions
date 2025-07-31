// Last updated: 31/07/2025, 21:09:03
class Solution {
    public int minSteps(String s, String t) {
        int[] freqs=new int[26];
        int[] freqt=new int[26];
        for(char ch:s.toCharArray())
        {
            freqs[ch-'a']++;
        }
        for(char ch:t.toCharArray())
        {
            freqt[ch-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            count+=Math.abs(freqs[i]-freqt[i]);
        }
        return count;
    }
}