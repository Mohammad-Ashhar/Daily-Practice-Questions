// Last updated: 31/07/2025, 21:07:19
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0, j = 0;
        List<int[]> merge = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            int idx1 = nums1[i][0];
            int idx2 = nums2[j][0];
            
            if (idx1 < idx2) {
                merge.add(new int[]{idx1, nums1[i][1]});
                i++;
            } else if (idx1 > idx2) {
                merge.add(new int[]{idx2, nums2[j][1]});
                j++;
            } else {
                merge.add(new int[]{idx1, nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            }
        }
        while (i < nums1.length) {
            merge.add(new int[]{nums1[i][0], nums1[i][1]});
            i++;
        }
        while (j < nums2.length) {
            merge.add(new int[]{nums2[j][0], nums2[j][1]});
            j++;
        }
        return merge.toArray(new int[merge.size()][]);
        
    }
}