// Last updated: 31/07/2025, 21:17:43
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        int n=nums.length;
        int count1=0;
        int count2=0;

        int maj=0;
        int maj2=0;
        for(int num:nums){
            if(num==maj){
                count1++;

            }
            else if(num==maj2){
                count2++;
            }
            else if(count1==0){
                maj=num;
                count1=1;
            }
            else if(count2==0){
                maj2=num;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }

        int fre=0;
        int fre2=0;
        for(int num:nums){
            if(num==maj){
                fre++;
            }
            else if(num==maj2){
                fre2++;
            }
        }
        if(fre> n/3){
            result.add(maj);
        }
        if(fre2> n/3){
            result.add(maj2);
        }

        return result;

        
    }
}