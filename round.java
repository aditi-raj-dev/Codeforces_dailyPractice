import java.util.Scanner;

public class round {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] roundNumbers = new int[10];
            int count = 0;
            int place = 1;

            while (n > 0) {

                int digit = n % 10;

                if (digit != 0) {
                    roundNumbers[count] = digit * place;
                    count++;
                }

                n = n / 10;
                place = place * 10;
            }

            System.out.println(count);

            for (int i = 0; i < count; i++) {
                System.out.print(roundNumbers[i]);

                if (i < count - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}