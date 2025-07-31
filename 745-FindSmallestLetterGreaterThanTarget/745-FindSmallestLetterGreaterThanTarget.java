// Last updated: 31/07/2025, 21:15:13
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i]>target)
            {
                return letters[i];
            }

        }
        return letters[0];
        
    }
}