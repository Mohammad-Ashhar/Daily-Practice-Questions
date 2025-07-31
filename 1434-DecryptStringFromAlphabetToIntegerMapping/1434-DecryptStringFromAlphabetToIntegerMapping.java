// Last updated: 31/07/2025, 21:12:57
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            if (s.charAt(i) != '#') {
                // Single digit character
                int num = s.charAt(i) - '0'; // Direct ASCII to integer conversion
                sb.append((char)('a' + num - 1)); // Convert number to corresponding letter
                i--;
            } else {
                // Two digit number with '#'
                int num = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0'); // Calculate two-digit number
                sb.append((char)('a' + num - 1)); // Convert number to corresponding letter
                i -= 3; // Skip past the two digits and the '#'
            }
        }

        return sb.reverse().toString(); // Reverse the StringBuilder to get the correct order
        
    }
}