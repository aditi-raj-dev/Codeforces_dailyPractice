import java.util.Scanner;

public class wanna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] passed = new boolean[n + 1];

        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            int level = sc.nextInt();
            passed[level] = true;
        }

        int y = sc.nextInt();

        for (int i = 0; i < y; i++) {
            int level = sc.nextInt();
            passed[level] = true;
        }

        for (int level = 1; level <= n; level++) {
            if (!passed[level]) {
                System.out.println("Oh, my keyboard!");
                sc.close();
                return;
            }
        }

        System.out.println("I become the guy.");

        sc.close();
    }
}
