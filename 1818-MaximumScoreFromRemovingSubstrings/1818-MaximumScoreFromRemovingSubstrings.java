// Last updated: 31/07/2025, 21:10:55
class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st1=new Stack<>();
         Stack<Character> st2=new Stack<>();
        int sum=0;
        
        if(y>x){
            for(int i=0;i<s.length();i++){
                if(!st1.empty() ){
                    if(st1.peek()=='b' && s.charAt(i)=='a') {
                
                    st1.pop();
                
                    sum+=y;
                    }
            
                    else{
                        st1.push(s.charAt(i));
                    }   
                }
                else{
                        st1.push(s.charAt(i));
                    }  
                 
            }
        while(!st1.isEmpty()){
              char c=st1.pop();
            if(!st2.isEmpty()){
              
                if(st2.peek()=='b' && c=='a'){
                    sum+=x;
                    st2.pop();
                }
                else{
                    st2.push(c);
                }
            }
            else{
                st2.push(c);
            }
        }
}
else{
      for(int i=0;i<s.length();i++){
            if(!st1.empty() ){
                if(st1.peek()=='a' && s.charAt(i)=='b') {
                
                st1.pop();
                
                sum+=x;
                }
            
                else{
                    st1.push(s.charAt(i));
                }   
            }
               else{
                    st1.push(s.charAt(i));
                }  
                 
        }
        while(!st1.isEmpty()){
              char c=st1.pop();
            if(!st2.isEmpty()){
              
                if(st2.peek()=='a' && c=='b'){
                    sum+=y;
                    st2.pop();
                }
                else{
                    st2.push(c);
                }
            }
            else{
                st2.push(c);
            }
        }

}
     return sum;  
    }
}