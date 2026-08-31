import java.util.Scanner;

public class world {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long bestRounds = Long.MAX_VALUE;
        int answer = 1;

        for (int i = 1; i <= n; i++) {
            long a = sc.nextLong();

            long rounds = (a - i + n) / n;

            if (rounds < bestRounds) {
                bestRounds = rounds;
                answer = i;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}