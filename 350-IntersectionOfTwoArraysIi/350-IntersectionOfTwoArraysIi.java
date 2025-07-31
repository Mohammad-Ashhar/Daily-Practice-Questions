// Last updated: 31/07/2025, 21:16:59
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int c1[]=new int[1001];
        int c2[]=new int[1001];
        for(int i=0;i<nums1.length;i++)
        {
            c1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            c2[nums2[i]]++;
        }
        ArrayList<Integer>t=new ArrayList<>();
        for(int i=0;i<1001;i++)
        {
            while(c1[i]>0 && c2[i]>0)
            {
                t.add(i);
                c1[i]--;
                c2[i]--;
            }
        }
        int r[]=new int[t.size()];
        for(int i=0;i<t.size();i++)
        {
            r[i]=t.get(i);
        }
        return r;
    }
}