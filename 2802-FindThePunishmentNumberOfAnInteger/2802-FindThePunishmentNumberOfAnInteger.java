// Last updated: 31/07/2025, 21:07:00
class Solution {
    public int punishmentNumber(int n) {
    //     int punishsum=0;
    //     for(int i=1;i<=n;i++)
    //     {
    //         if(isPunishmentNum(i))
    //         {
    //             punishsum+=i*i;
    //         }
    //     }
    //     return punishsum;
    // }
    //     public static boolean canPartition(String s , int target,int ind,int curSum)
    //     {
    //         if(ind==s.length())
    //         {
    //             return curSum==target;
    //         }
    //         int num=0;
    //         for(int i=ind;i<s.length();i++)
    //         {
    //             num=num*10+(s.charAt(i)-'0');
    //             if(canPartition(s,target,i+1,curSum+num))
    //             {
    //                 return true;
    //             }
    //         }
    //         return false;
    //     }
    //     public static boolean isPunishmentNum(int i)
    //     {
    //         int sq=i*i;
    //         String sqst=String.valueOf(sq);
    //         return canPartition(sqst,i,0,0);
    //     }
    // }

    int punish=0;
    for(int i=1;i<=n;i++)
    {
        if(punNumber(i))
        {
            punish+=i*i;
        }
    }
    return punish;
    }
    public static boolean punNumber(int num)
    {
        return canPart(Integer.toString(num*num),num,0,0);
    }
    public static boolean canPart(String s,int target,int idx,int cursum)
    {
        if(idx==s.length())
        {
            return target==cursum;
        }
        int ans=0;
        for(int i=idx;i<s.length();i++)
        {
            ans=ans*10+(s.charAt(i)-'0');
            if(canPart(s,target,i+1,cursum+ans))
            {
                return true;
            }
        }
        return false;
    }
}
