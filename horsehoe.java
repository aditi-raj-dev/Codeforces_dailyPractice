import java.util.HashSet;
import java.util.Scanner;

public class horsehoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> colors = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            int color = sc.nextInt();
            colors.add(color);
        }

        int answer = 4 - colors.size();

        System.out.println(answer);

        sc.close();
    }
}