// Last updated: 31/07/2025, 21:15:45
class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length/2;
        Set<Integer>set=new HashSet<>();
        for(int i:candyType)
        {
            set.add(i);
        }
        int l=set.size();
        if(l<=n)
        {
            return l;
        }
        else{
            return n;
        }
        
    }
}