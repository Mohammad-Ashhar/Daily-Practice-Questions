// Last updated: 31/07/2025, 21:13:16
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans=new ArrayList<>();
        String previous="";
        for(String f:folder)
        {
            if(previous.isEmpty() || !(f.length()>previous.length() && f.startsWith(previous) && f.charAt(previous.length())=='/'))
            {
                ans.add(f);
                previous=f;
            }
        }
        return ans;
        
    }
}