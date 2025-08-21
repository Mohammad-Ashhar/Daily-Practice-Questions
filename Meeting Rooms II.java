import java.util.*;
public class MeetingRoomsII {
    public static void main(String[] args){
        int[][] intervals = {{10,30},{5,10},{15,20},{2,6},{12,18},{19,25},{1,5},{3,5}};
        // Arrays.sort(intervals, (a, b) -> a[0] -b[0]);
        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        MeetingRoomsII solution = new MeetingRoomsII();
        int minRooms = solution.minMeetingRooms(intervals);
        System.out.println("Minimum number of meeting rooms required: " + minRooms);
        // System.out.println("Minimum number of meeting rooms required: " + minHeap.size());
    }
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        pq.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] current = intervals[i];
            int[] earliestEnding = pq.peek();
            if(current[0] >= earliestEnding[1]){
                pq.poll();
            }
            pq.add(current);
        }
        return pq.size();
}
}
