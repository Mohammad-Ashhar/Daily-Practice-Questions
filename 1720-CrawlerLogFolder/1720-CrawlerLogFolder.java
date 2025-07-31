// Last updated: 31/07/2025, 21:11:19
class Solution {
    public int minOperations(String[] logs) {
       int depth = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                if (depth > 0) {
                    depth--;
                }
            } else if (!log.equals("./")) {
                depth++;
            }
        }

        return depth;
    } 
    }
