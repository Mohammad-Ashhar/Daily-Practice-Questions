class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freq=new int[26];
        for(char c:letters) freq[c-'a']++;
        return dfs(words,freq,score,0);
    }
    public int dfs(String[] words,int[] freq,int[] score,int idx) {
        if(idx==words.length) return 0;
        int np=dfs(words,freq,score,idx + 1);
        int[] copy=freq.clone();
        int ws=0;
        boolean used = true;
        for (char c:words[idx].toCharArray()) {
            int i=c-'a';
            if (--copy[i]<0) { 
                used=false; 
                break; 
            }
            ws+=score[i];
        }
        int p=0;
        if(used) p=ws+dfs(words,copy,score,idx+1);
        return Math.max(np,p);
    }
}
