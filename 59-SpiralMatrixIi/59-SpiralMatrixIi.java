// Last updated: 31/07/2025, 21:19:06
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int value = 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
        }
        return matrix;
    }
}