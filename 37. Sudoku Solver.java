import java.util.*;

public class Solution {
    public void solveSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        List<int[]> empty = new ArrayList<>();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch == '.') {
                    empty.add(new int[]{r, c});
                } else {
                    int d = ch - '1';
                    row[r][d] = true;
                    col[c][d] = true;
                    box[(r / 3) * 3 + (c / 3)][d] = true;
                }
            }
        }
        backtrack(board, 0, empty, row, col, box);
        for (int p = 0; p < 9; p++) {
            for (int q = 0; q < 9; q++) {
                System.out.print(board[p][q] + " ");
            }
            System.out.println();
        }
    }
    private boolean backtrack(char[][] board, int idx,
                        List<int[]> empty,
                        boolean[][] row,
                        boolean[][] col,
                        boolean[][] box) {
        if (idx == empty.size()) return true;
        int r = empty.get(idx)[0];
        int c = empty.get(idx)[1];
        int b = (r / 3) * 3 + (c / 3);
        for (int d = 0; d < 9; d++) {
            if (!row[r][d] && !col[c][d] && !box[b][d]) {
                board[r][c] = (char) ('1' + d);
                row[r][d] =true;
                col[c][d] =true;
                box[b][d] =true;
                if (backtrack(board, idx + 1, empty, row, col, box)) return true;
                board[r][c] = '.';
                row[r][d] =false;
                col[c][d] =false;
                box[b][d] =false;
            }
        }
        return false;
    }
}
