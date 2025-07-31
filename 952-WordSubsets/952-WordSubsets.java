// Last updated: 31/07/2025, 21:14:29
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = findUniversalStrings(words1, words2);
        return result;
    }
    public static List<String> findUniversalStrings(String[] words1, String[] words2) {
        int[] requiredFreq = new int[26]; 
        for (String word : words2) {
            int[] tempFreq = new int[26];
            for (char c : word.toCharArray()) {
                tempFreq[c - 'a']++;
                requiredFreq[c - 'a'] = Math.max(requiredFreq[c - 'a'], tempFreq[c - 'a']);
            }
        }
        List<String> result = new ArrayList<>();
        for (String word : words1) {
            if (isUniversal(word, requiredFreq)) {
                result.add(word);
            }
        }

        return result;
    }

    public static boolean isUniversal(String word, int[] requiredFreq) {
        int[] wordFreq = new int[26];
        for (char c : word.toCharArray()) {
            wordFreq[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < requiredFreq[i]) {
                return false;
            }
        }

        return true;
    }
        
    
}