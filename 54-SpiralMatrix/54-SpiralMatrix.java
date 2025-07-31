// Last updated: 31/07/2025, 21:19:16
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        if (matrix.length == 0 || matrix[0].length == 0) {
            return result;  // If the matrix is empty, return an empty list
        }
        
        int l = matrix.length;
        int l2 = matrix[0].length;
        
        int minr = 0;  // min row
        int maxr = l - 1;  // max row
        int minc = 0;  // min column
        int maxc = l2 - 1;  // max column
        
        int totalElements = l * l2;
        
        while (result.size() < totalElements) {
            // Traverse from left to right
            for (int i = minc; i <= maxc && result.size() < totalElements; i++) {
                result.add(matrix[minr][i]);
            }
            minr++; // Move down the top boundary
            
            // Traverse from top to bottom
            for (int i = minr; i <= maxr && result.size() < totalElements; i++) {
                result.add(matrix[i][maxc]);
            }
            maxc--; // Move left the right boundary
            
            // Traverse from right to left
            for (int i = maxc; i >= minc && result.size() < totalElements; i--) {
                result.add(matrix[maxr][i]);
            }
            maxr--; // Move up the bottom boundary
            
            // Traverse from bottom to top
            for (int i = maxr; i >= minr && result.size() < totalElements; i--) {
                result.add(matrix[i][minc]);
            }
            minc++; // Move right the left boundary
        }
        
        return result;
    }
}
