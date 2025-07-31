// Last updated: 31/07/2025, 21:13:06
class Solution {
    public String tictactoe(int[][] moves) {
        char[] arr = new char[9];
        Arrays.fill(arr,'-');
        char ch = 'o';
        for(int i = 0; i < moves.length; i++){
            ch = i%2 == 0 ? 'x' : 'o';
            arr[(moves[i][0]*3) + moves[i][1]] = ch;
        }

        //All checks
        int[][] check = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        for(int i = 0; i < check.length; i++){
            int a = check[i][0];
            int b = check[i][1];
            int c = check[i][2];
            if(arr[a] == arr[b] && arr[b] == arr[c] && arr[a] != '-')
                return arr[a] == 'x' ? "A" : "B";
        }
        return moves.length != 9 ? "Pending" : "Draw";   
    }
}