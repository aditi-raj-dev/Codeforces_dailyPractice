import java.util.ArrayList;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            ArrayList<Integer> parts = new ArrayList<>();
            int place = 1;

            while (n > 0) {
                int digit = n % 10;

                if (digit != 0) {
                    parts.add(digit * place);
                }

                n /= 10;
                place *= 10;
            }

            System.out.println(parts.size());

            for (int part : parts) {
                System.out.print(part + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
