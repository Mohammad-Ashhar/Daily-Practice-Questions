import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(Count(n));
        }
    }

    public static int Count(int n) {
        int count = 0;
        if (n == 0 ) return -1;

        while (n != 1) {
            if (n % 6 == 0) {
                n /= 6;
                count++;
            } else {
                n *= 2;
                count++;
                if (n % 6 != 0 && n % 3 != 0) return -1; // no hope
            }
        }
        return count;
    }
}
