import java.util.Scanner;

public class kefa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int previous = sc.nextInt();

        int currentLength = 1;
        int maximumLength = 1;

        for (int i = 1; i < n; i++) {
            int current = sc.nextInt();

            if (current >= previous) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            maximumLength = Math.max(maximumLength, currentLength);

            previous = current;
        }

        System.out.println(maximumLength);

        sc.close();
    }
}