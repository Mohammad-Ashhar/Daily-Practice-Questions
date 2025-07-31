// Last updated: 31/07/2025, 21:08:49
class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        for(char c:s.toCharArray())
        {
            if(c==letter)
            {
                count++;
            }
        }
        return count*100 / s.length();
    }
}