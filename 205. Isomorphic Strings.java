class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Character>maps=new HashMap<>();
        Map<Character,Character>mapt=new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(maps.containsKey(ch1)) {
                if(maps.get(ch1)!=ch2) return false;
            } else {
                maps.put(ch1,ch2);
            }
            if(mapt.containsKey(ch2)) {
                if(mapt.get(ch2)!=ch1) return false;
            } else {
                mapt.put(ch2,ch1);
            }
        }
        return true;
    }
}