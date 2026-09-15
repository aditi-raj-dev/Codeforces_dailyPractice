import java.util.Scanner;

public class toy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] goodCars = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {

            boolean good = true;

            for (int j = 0; j < n; j++) {

                int x = sc.nextInt();

                // 1 = car i turned over
                // 3 = both cars turned over
                if (x == 1 || x == 3) {
                    good = false;
                }
            }

            if (good) {
                goodCars[count++] = i + 1;
            }
        }

        System.out.println(count);

        for (int i = 0; i < count; i++) {
            System.out.print(goodCars[i]);

            if (i < count - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();

        sc.close();
    }
}