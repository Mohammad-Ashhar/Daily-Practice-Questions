// Last updated: 31/07/2025, 21:12:38
class Solution {
    public static boolean getMaxInCol(int j,int [][] matrix,int min,int n){
        int num=Integer.MIN_VALUE,I=-1;
        for(int i=0;i<n;i++){
            if(matrix[i][j]>num){
                num = matrix[i][j];
                I=i;
            }
        }

        return matrix[I][j]==min;
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [] rowMin = new int[n];
        for(int i=0;i<n;i++){
            int num=Integer.MAX_VALUE,col=-1;
            for(int j=0;j<m;j++){
                if(matrix[i][j]<num){
                    num = matrix[i][j];
                    col=j;
                }
            }
            rowMin[i]=col;
        }
       

        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(getMaxInCol(rowMin[i],matrix,matrix[i][rowMin[i]],n)){
                ans.add(matrix[i][rowMin[i]]);
            }
        }

        return ans;
    }
}