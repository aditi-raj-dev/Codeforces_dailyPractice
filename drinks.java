import java.util.Scanner;

public class drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double sum = 0;

        for (int i = 0; i < n; i++) {
            double percentage = sc.nextDouble();
            sum += percentage;
        }

        double answer = sum / n;

        System.out.println(answer);

        sc.close();
    }
}