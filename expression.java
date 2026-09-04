import java.util.Scanner;

public class expression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int answer = Integer.MIN_VALUE;

        answer = Math.max(answer, a + b + c);
        answer = Math.max(answer, a * b * c);
        answer = Math.max(answer, (a + b) * c);
        answer = Math.max(answer, a * (b + c));
        answer = Math.max(answer, a + b * c);
        answer = Math.max(answer, a * b + c);

        System.out.println(answer);

        sc.close();
    }
}