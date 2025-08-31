class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans=new int[friends.length];
        int a=0;
        for(int num:order)
            {
                for(int fri:friends)
                    {
                        if(num==fri){
                            ans[a++]=num;
                            break;
                        }
                        
                    }
            }
        return ans;
        
    }
}