// Last updated: 31/07/2025, 21:12:16
class Solution {
    public String destCity(List<List<String>> paths) {
       Set<String> start = new HashSet<>();
        int n = paths.size();
        for(int i = 0; i<n; i++) {
            String s = paths.get(i).get(0);
            // if(!start.contains(s))
            start.add(s);
        }
        for(int i = 0; i<n; i++) {
            String d = paths.get(i).get(1);
            if(!start.contains(d)) return d;
        }
        return "";
    }
}