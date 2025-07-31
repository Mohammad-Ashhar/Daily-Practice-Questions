// Last updated: 31/07/2025, 21:07:41
class Solution {
    public int passThePillow(int n, int time) {
        int count = 2;
        int dir = 1;
        for(int i = 1;i<=time;i++){
            if(time == i)
                return count;
            if(count == n || count == 1){
                dir = dir*(-1);
            }
            count = count+dir;
        }
        return count;
    }
}