// Last updated: 31/07/2025, 21:03:47
class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> e = new ArrayList<>();
        List<String> g    = new ArrayList<>();
        List<String> p   = new ArrayList<>();
        List<String> r = new ArrayList<>();
        for (int i = 0; i < code.length; i++) {
            String co = code[i];
            String bu = businessLine[i];
            if (co == null || co.isEmpty() || !co.matches("[A-Za-z0-9_]+")) 
                continue;
            if (!isActive[i]) 
                continue;
            switch (bu) {
                case "electronics": e.add(co); 
                    break;
                case "grocery":    g.add(co);    
                    break;
                case "pharmacy":   p.add(co);   
                    break;
                case "restaurant": r.add(co);
                    break;
                default: 
                    break;
            }
        }
        Collections.sort(e);
        Collections.sort(g);
        Collections.sort(p);
        Collections.sort(r);
        List<String> ans = new ArrayList<>();
        ans.addAll(e);
        ans.addAll(g);
        ans.addAll(p);
        ans.addAll(r);
        return ans;
    }
}
