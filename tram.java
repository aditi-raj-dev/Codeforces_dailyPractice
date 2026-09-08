import java.util.Scanner;

public class tram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int current = 0;
        int maximum = 0;

        for (int i = 0; i < n; i++) {

            int leaving = sc.nextInt();
            int entering = sc.nextInt();

            current = current - leaving + entering;

            maximum = Math.max(maximum, current);
        }

        System.out.println(maximum);

        sc.close();
    }
}