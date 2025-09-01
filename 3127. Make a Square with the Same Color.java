class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for (int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                int b=0;
                int w=0;
                for (int k=i;k<i+2;k++) {
                    for (int l=j;l<j+2;l++) {
                        if (grid[k][l]=='B') b++;
                        else w++;
                    }
                }
                if (b==4 || w==4) return true;
                if (b==3 || w==3) return true;
            }
        }
        return false;  
    }
}