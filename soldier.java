import java.util.Scanner;

public class soldier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= w; i++) {
            total += i * k;
        }

        int borrow = total - n;

        if (borrow < 0) {
            borrow = 0;
        }

        System.out.println(borrow);

        sc.close();
    }
}
