import java.util.*;

public class toy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] broken = new boolean[n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                int x = sc.nextInt();

                if (x != 0) {
                    broken[i] = true;
                    broken[j] = true;
                }
            }
        }

        int count = 0;

        for (boolean b : broken) {
            if (!b) {
                count++;
            }
        }

        System.out.println(count);

        for (int i = 0; i < n; i++) {

            if (!broken[i]) {
                System.out.print((i + 1) + " ");
            }
        }

        System.out.println();

        sc.close();
    }
}