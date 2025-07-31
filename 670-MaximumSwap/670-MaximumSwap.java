// Last updated: 31/07/2025, 21:15:33
class Solution {
    public int maximumSwap(int num) {
        int max = num;
        char temp;
        char digit[] = Integer.toString(num).toCharArray();
        for(int i = 0 ; i < digit.length ; i++){
            for(int j = i + 1 ; j < digit.length ; j++){
                temp = digit[i];
                digit[i] = digit[j];
                digit[j] = temp;
                int newnum = Integer.parseInt(new String(digit));

                if(newnum > max){
                    max = newnum;
                }
                temp = digit[i];
                digit[i] = digit[j];
                digit[j] = (char)temp;
            }
        }
        return max;
        
        

        
        
    }
}