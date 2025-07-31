// Last updated: 31/07/2025, 21:12:21
class Solution {
    public int maxDiff(int num) {
        String n=String.valueOf(num);
        String max=mapMax(n);
        String min=mapMin(n);
        return Integer.parseInt(max)-Integer.parseInt(min);
    }
    private String mapMax(String num)
    {
        for(char c:num.toCharArray())
        {
            if(c!='9')
            {
                return num.replace(c,'9');           
            }
        }
        return num;
    }
    private String mapMin(String num)
    {
        if(num.charAt(0)>'1')
        {
            return num.replace(num.charAt(0),'1');
        }
        for(int i=1;i<num.length();i++)
        {
            if(num.charAt(i)>'1')
            {
                return num.replace(num.charAt(i),'0');
            }
        }
        return num;
    }
}