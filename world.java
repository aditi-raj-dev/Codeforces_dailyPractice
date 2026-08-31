import java.util.Scanner;

public class world {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long bestTime = Long.MAX_VALUE;
        int answer = 1;

        for (int i = 1; i <= n; i++) {
            long a = sc.nextLong();

            long time = a * n + i;

            if (time < bestTime) {
                bestTime = time;
                answer = i;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}