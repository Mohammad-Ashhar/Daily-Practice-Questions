// Last updated: 31/07/2025, 21:04:33
class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int max = 0; 
        int longest = 0; 
        int index = events[0][0];         
        for (int i = 0; i < events.length; i++) {
            int current = events[i][1];
            int diff = current - max;
            if (i == 0) {
                diff = current;
            }            
            if (diff > longest) {
                longest = diff;
                index = events[i][0];
            } 
            else if (diff == longest && events[i][0] < index) {
                index = events[i][0];
            }
            max = current;
        }
        
        return index;
    }
}
