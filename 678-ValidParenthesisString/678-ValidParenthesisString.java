// Last updated: 31/07/2025, 21:15:31
class Solution {
    public boolean checkValidString(String s) {
        
        int minOpen = 0; // Minimum number of open parentheses needed
        int maxOpen = 0; // Maximum number of open parentheses allowed

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                minOpen++;
                maxOpen++;
            } else if (ch == ')') {
                minOpen = Math.max(minOpen - 1, 0); // Decrement minOpen, but never negative
                maxOpen--;
                if (maxOpen < 0) {
                    return false; // More closing parentheses than opening ones
                }
            } else { // Asterisk
                minOpen = Math.max(minOpen - 1, 0); // Treat asterisk as closing or empty
                maxOpen++; // Treat asterisk as opening or empty
            }
        }

        return minOpen == 0; // All open parentheses are balanced
    }
}
