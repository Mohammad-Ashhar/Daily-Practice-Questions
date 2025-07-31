// Last updated: 31/07/2025, 21:04:18
class Solution {
    public int[] assignElements(int[] groups, int[] elements) {
        int n=groups.length;
        int m=elements.length;
        int[] assign=new int[n];
        Arrays.fill(assign,-1);
        HashMap<Integer, Integer> eMap = new HashMap<>();
        for (int j = 0; j < m; j++) {
            eMap.putIfAbsent(elements[j], j); 
        }
        for (int i = 0; i < n; i++) {
            int minIdx = Integer.MAX_VALUE; 
            for (int div = 1; div * div <= groups[i]; div++) {
                if (groups[i] % div == 0) {
                    if (eMap.containsKey(div)) {
                        minIdx = Math.min(minIdx, eMap.get(div));
                    }
                    int otherDiv = groups[i] / div;
                    if (eMap.containsKey(otherDiv)) {
                        minIdx = Math.min(minIdx, eMap.get(otherDiv));
                    }
                }
            }
            assign[i] = (minIdx == Integer.MAX_VALUE) ? -1 : minIdx;
        }
        
        return assign;
    }
}