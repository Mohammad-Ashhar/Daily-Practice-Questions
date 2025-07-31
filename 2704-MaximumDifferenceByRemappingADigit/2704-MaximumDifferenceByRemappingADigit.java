// Last updated: 31/07/2025, 21:07:21
class Solution {
    public int minMaxDifference(int num) {
        String str=String.valueOf(num);
        String max=MapMax(str);
        String min=MapMin(str);
        return Integer.parseInt(max)-Integer.parseInt(min);
    }
    private String MapMax(String s)
    {
        for(char c:s.toCharArray())
        {
            if(c!='9')
            {
                return s.replace(c,'9');
            }
        }
        return s;
    }
    private String MapMin(String s)
    {
        char torep=0;
        for (char c : s.toCharArray()) {
            if (c != '0') {
                torep = c;
                break;
            }
        }
        if (torep != 0) {
            return s.replace(torep, '0');
        }
        return s;
    }
}