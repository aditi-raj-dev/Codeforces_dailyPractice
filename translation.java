import java.util.Scanner;

public class translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        if (s.length() != t.length()) {
            System.out.println("NO");
            sc.close();
            return;
        }

        boolean isReverse = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(t.length() - 1 - i)) {
                isReverse = false;
                break;
            }
        }

        if (isReverse) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}