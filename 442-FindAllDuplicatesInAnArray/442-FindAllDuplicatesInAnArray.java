// Last updated: 31/07/2025, 21:16:24
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] freq=new int[nums.length+1];
        for(int num:nums)
        {
            freq[num]+=1;
        }
        List<Integer>ll=new ArrayList<>();
        for(int i=1;i<freq.length;i++)
        {
            if(freq[i]==2)
            {
                ll.add(i);
            }
        }
        return ll;        
    }
}