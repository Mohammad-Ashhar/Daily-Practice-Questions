import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int fixed = -2;  
            boolean used = true;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a != -1) {
                    if (fixed == -2) {
                        fixed = a;
                    } else if (fixed != a) {
                        used = false;
                    }
                }
            }
            if (!used) {
                System.out.println("NO");
            } else if (fixed == -2) {
                System.out.println("YES");
            } else if (fixed == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
