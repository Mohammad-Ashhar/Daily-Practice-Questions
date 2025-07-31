// Last updated: 31/07/2025, 21:17:14
class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0;
        int cows=0;
        int sec[]=new int[10];
        int gue[]=new int[10];
        for(int i=0;i<secret.length();i++)
        {
            char s=secret.charAt(i);
            char g=guess.charAt(i);
            if(s==g)
                bulls++;
            else
            {
                sec[s-'0']++;
                gue[g-'0']++;
            }
        }
        for(int i=0;i<10;i++)
        {
            cows+=Math.min(sec[i],gue[i]);
        }
        return bulls+"A"+cows+"B";
        
    }
}