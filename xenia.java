import java.util.Scanner;

public class xenia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int m = sc.nextInt();

        long current = 1;
        long steps = 0;

        for (int i = 0; i < m; i++) {
            long next = sc.nextLong();

            if (next >= current) {
                steps += next - current;
            } else {
                steps += (n - current) + next;
            }

            current = next;
        }

        System.out.println(steps);
        sc.close();
    }
}