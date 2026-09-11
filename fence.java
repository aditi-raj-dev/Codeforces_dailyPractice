import java.util.Scanner;

public class fence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        // Calculate the first window
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += h[i];
        }

        int minSum = currentSum;
        int answer = 0;

        // Slide the window
        for (int i = k; i < n; i++) {

            currentSum = currentSum - h[i - k] + h[i];

            if (currentSum < minSum) {
                minSum = currentSum;
                answer = i - k + 1;
            }
        }

        // Convert 0-based index to 1-based
        System.out.println(answer + 1);

        sc.close();
    }
}