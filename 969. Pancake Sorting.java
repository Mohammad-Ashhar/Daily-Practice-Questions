class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer>ll=new ArrayList<>();
        int n=arr.length;
        for(int i=n;i>=1;i--)
        {
            int idx=0;
            while(arr[idx]!=i) idx++;
            if(idx==i-1) continue;
            if(idx!=0)
            {
                flip(arr,idx+1);
                ll.add(idx+1);
            }
            flip(arr,i);
            ll.add(i);
        }
        return ll;
    }
    public void flip(int[] arr,int idx)
    {
        int left=0,right=idx-1;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}