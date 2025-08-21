class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        PriorityQueue<Map.Entry<Character,Integer>>pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> max = pq.poll();
            char ch = max.getKey();
            int count = max.getValue();
            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
        
    }
}