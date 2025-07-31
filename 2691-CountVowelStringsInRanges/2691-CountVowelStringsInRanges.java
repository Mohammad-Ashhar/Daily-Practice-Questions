// Last updated: 31/07/2025, 21:07:31
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixSum = new int[n];
        for (int i = 0; i < n; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                prefixSum[i] = 1;
            }
            if (i > 0) {
                prefixSum[i] += prefixSum[i - 1];
            }
        }
        int[] result = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            int start = queries[j][0];
            int end = queries[j][1];
            result[j] = prefixSum[end] - (start > 0 ? prefixSum[start - 1] : 0);
        }
        
        return result;
    }
    
    public boolean isVowel(char ch) {
        return "aeiou".indexOf(Character.toLowerCase(ch)) != -1;
    }
}
