// Last updated: 31/07/2025, 21:04:11
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] placed=new boolean[fruits.length];
        int notplaced=0;
        for(int i=0;i<fruits.length;i++)
            {
                boolean used=false;
                for(int j=0;j<fruits.length;j++)
                    {
                        if(!placed[j] && baskets[j]>=fruits[i])
                        {
                            placed[j]=true;
                            used=true;
                            break;
                        }
                    }
                if(!used)
                {
                    notplaced++;
                }
            }
        // System.out.println(notplaced);
        return notplaced;
    }
}