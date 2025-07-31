// Last updated: 31/07/2025, 21:03:51
class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
            {
                switch(ch)
                    {
                        case '*':
                            if (sb.length() > 0) {
                            sb.deleteCharAt(sb.length() - 1);
                        }
                        break;
                        case '#':
                            sb.append(sb.toString());
                        break;
                        case '%':
                            sb.reverse();
                            break;
                        default:
                            sb.append(ch);
                            break;
                    }
            }
        return sb.toString();
        
    }
}