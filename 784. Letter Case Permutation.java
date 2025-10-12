class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String>ll=new ArrayList<>();
        char[] arr=s.toCharArray();
        fun(arr,0,ll);
        return ll;        
    }
    public void fun(char[] arr,int idx,List<String>ll)
    {
        if(idx==arr.length)
        {
            ll.add(new String(arr));
            return;
        }
        char c=arr[idx];
        if(Character.isLetter(c))
        {
            arr[idx]=Character.toLowerCase(c);
            fun(arr,idx+1,ll);

            arr[idx]=Character.toUpperCase(c);
            fun(arr,idx+1,ll);
        }
        else
        {
            fun(arr,idx+1,ll);
        }
    }
}