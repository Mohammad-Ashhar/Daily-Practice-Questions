// Last updated: 31/07/2025, 21:16:28
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ll=new ArrayList<>();
        if(s.length()<p.length())
        {
            return ll;
        }
        int[] pfreq=new int[26];
        int[] sfreq=new int[26];
        for(char c:p.toCharArray())
        {
            pfreq[c-'a']++;
        }
        int wsize=p.length();
        for(int i=0;i<wsize;i++)
        {
            sfreq[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pfreq,sfreq))
        {
            ll.add(0);
        }
        for(int i=wsize;i<s.length();i++)
        {
            sfreq[s.charAt(i-wsize)-'a']--;
            sfreq[s.charAt(i)-'a']++;
            if(Arrays.equals(pfreq,sfreq))
            {
                ll.add(i-wsize+1);
            }
        }
        return ll;
    }
}