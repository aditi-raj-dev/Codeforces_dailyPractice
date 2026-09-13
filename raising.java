import java.util.Scanner;

public class raising {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int answer = 0;

        while (x > 0) {

            if ((x & 1) == 1) {
                answer++;
            }

            x = x >> 1;
        }

        System.out.println(answer);

        sc.close();
    }
}