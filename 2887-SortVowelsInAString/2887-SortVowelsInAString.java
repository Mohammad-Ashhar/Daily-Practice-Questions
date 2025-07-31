// Last updated: 31/07/2025, 21:06:45
class Solution {
    public String sortVowels(String s) {
        if(s.length()<=1)
        {
            return s;
        }
        List<Character> vowel=new ArrayList<>();
        String v="AEIOUaeiou";
        for(char ch:s.toCharArray())
        {
            if(v.contains(String.valueOf(ch)))
            {
                vowel.add(ch);
            }
        }
        Collections.sort(vowel);
        StringBuilder sb=new StringBuilder();
        int vc=0;
        for(char ch:s.toCharArray())
        {
            if(v.contains(String.valueOf(ch)))
            {
                sb.append(vowel.get(vc++));
            }
            else{
            sb.append(ch);
        }
        }
        return sb.toString();
    }
}