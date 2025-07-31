// Last updated: 31/07/2025, 21:16:35
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int num : nums) {
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }
        int s = numbers.size();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = numbers.get(i);
        }
        Arrays.sort(arr);
        if (s < 3) {
            return arr[s - 1];
        }
        return arr[s - 3];
    }
}
