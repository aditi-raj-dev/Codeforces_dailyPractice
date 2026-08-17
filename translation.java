import java.util.Scanner;

public class translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        boolean isReverse = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(s.length() - 1 - i)) {
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