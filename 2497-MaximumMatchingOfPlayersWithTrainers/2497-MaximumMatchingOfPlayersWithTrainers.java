// Last updated: 31/07/2025, 21:08:14
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n=players.length,m=trainers.length;
        int p=0,t=0,match=0;
        while(p<n && t<m)
        {
            if(trainers[t]>=players[p])
            {
                match++;
                p++;
                t++;
            }
            else
            {
                t++;
            }
        }
        return match;
        
    }
}