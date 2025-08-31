class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set=new HashSet<>();
        for(String email:emails)
        {
            String[] split=email.split("@");
            String local=split[0];
            String domain=split[1];
            int pidx=local.indexOf('+');
            if(pidx!=-1) local=local.substring(0,pidx);
            local=local.replace(".","");
            String ans=local+"@"+domain;
            set.add(ans);
        }
        return set.size();
        
    }
}