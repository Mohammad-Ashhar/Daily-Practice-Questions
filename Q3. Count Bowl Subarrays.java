class Solution {
    public long bowlSubarrays(int[] nums) {
        int n=nums.length;
        int[] bowlNext=new int[n]; 
        Arrays.fill(bowlNext, -1);
        int[] st=new int[n]; 
        int top=-1;
        for(int i=0;i<n;i++) {
            while(top>=0 && nums[i]>nums[st[top]]) bowlNext[st[top--]]=i;
            st[++top]=i;
        }
        int[] bowlPrev=new int[n]; 
        Arrays.fill(bowlPrev,-1);
        top=-1;
        for(int i=0;i< n;++i) {
            while(top>=0 && nums[st[top]]<nums[i]) top--;
            bowlPrev[i]=(top==-1)?-1:st[top];
            st[++top]=i;
        }
        long ans=0;
        for(int i=0;i<n;++i) if(bowlPrev[i]!=-1 && bowlNext[i]!=-1) ans++;
        return ans;
    }
}
