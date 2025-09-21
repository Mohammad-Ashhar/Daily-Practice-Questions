class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length) return false;
        Map<Character,String>mapcw=new HashMap<>();
        Map<String,Character>mapwc=new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            String word=arr[i];
            if(mapcw.containsKey(ch))
            {
                if(!mapcw.get(ch).equals(word)) return false;
            }
            else mapcw.put(ch,word);
            if(mapwc.containsKey(word))
            {
                if(mapwc.get(word)!=ch) return false;
            }
            else mapwc.put(word,ch);

        }
        return true;

        
    }
}