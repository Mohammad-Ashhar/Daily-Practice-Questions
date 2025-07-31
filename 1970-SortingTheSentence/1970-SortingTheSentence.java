// Last updated: 31/07/2025, 21:10:27
class Solution {
    public String sortSentence(String s) {
        String[] arr =s.split(" ");
        String[] rearr = new String[arr.length];
        StringBuilder ans =  new StringBuilder();
        int i=0;
        for(String ele: arr){
            i = (int) ( ele.charAt(ele.length()-1) - '0');
            rearr[i-1] = ele.substring(0 , ele.length() - 1);
        }
        for(i = 0; i< rearr.length -1 ; i++){
            ans.append(rearr[i]).append(" ");
        }
        ans.append(rearr[i]);
        return ans.toString();
    }
}