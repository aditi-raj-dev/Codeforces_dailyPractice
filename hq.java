import java.util.Scanner;

public class hq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'H' || ch == 'Q' || ch == '9') {
                System.out.println("YES");
                sc.close();
                return;
            }
        }

        System.out.println("NO");

        sc.close();
    }
}