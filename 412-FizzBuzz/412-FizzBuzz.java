// Last updated: 31/07/2025, 21:16:36
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> r=new ArrayList<>(); 
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                r.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                r.add("Fizz");
            }
            else if(i%5==0)
            {
                r.add("Buzz");
            }
            else
            {
                r.add(Integer.toString(i));
            }
        }
        return r;
        
    }
}