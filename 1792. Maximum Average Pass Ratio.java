class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]>pq=new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));
        for(int[] Class:classes)
        {
            int pass=Class[0];
            int total=Class[1];
            pq.add(new double[]{gain(pass,total),pass,total});
        }
        for(int extra=0;extra<extraStudents;extra++)
        {
            double[] top=pq.poll();
            int pass=(int)top[1];
            int total=(int)top[2];
            pass++;
            total++;
            pq.add(new double[]{gain(pass,total),pass,total});
        }
        double sum=0.0;
        while(!pq.isEmpty())
        {
            double[] top=pq.poll();
            int pass=(int)top[1];
            int total=(int)top[2];
            sum+=(double)pass/total;
        }
        return sum/classes.length;
        
    }
    private double gain(int pass,int total)
    {
        return (double)(pass+1)/(total+1) - (double)pass/total;
    }
}