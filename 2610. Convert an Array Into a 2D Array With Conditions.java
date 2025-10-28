class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int max=0;
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            max=Math.max(max,map.get(num));
        }
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<max;i++) ll.add(new ArrayList<>());
        for(Map.Entry<Integer,Integer>e:map.entrySet())
        {
            int n=e.getKey();
            int freq=e.getValue();
            for(int i=0;i<freq;i++) ll.get(i).add(n);
        }
        return ll;
        
    }
}