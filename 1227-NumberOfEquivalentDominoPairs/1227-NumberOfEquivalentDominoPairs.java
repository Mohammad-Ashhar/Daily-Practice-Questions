// Last updated: 31/07/2025, 21:13:38
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] identifierCounts = new int[100]; // Assuming domino values are between 1 and 9

        int result = 0;
        for (int i = 0; i < dominoes.length; i++) {
            int identifier = dominoes[i][0] * 10 + dominoes[i][1];
            int reverseIdentifier = dominoes[i][1] * 10 + dominoes[i][0];

            // Increment counts for both identifiers
            result += identifierCounts[identifier];
            if (identifier != reverseIdentifier) {
                result += identifierCounts[reverseIdentifier];
            }

            // Update the count for the current identifier
            identifierCounts[identifier]++;
        }

        return result;
        
    }
}