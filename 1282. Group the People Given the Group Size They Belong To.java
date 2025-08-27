class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++)
        {
            int val=groupSizes[i];
            if(!map.containsKey(val)) map.put(val,new ArrayList<>());
            map.get(val).add(i);
            if(map.get(val).size()==val)
            {
                result.add(new ArrayList<>(map.get(val)));
                map.get(val).clear();
            } 
        }
        return result;
        
    }
}