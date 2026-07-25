import java.util.Scanner;

public class next {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().trim().split("\\s+");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int count = 0;
        int value = numbers[k - 1];
        for (int i = 0; i < n; i++) {
            if (numbers[i] >= value && numbers[i] > 0) {
                count++;
            }

        }

        System.out.println(count);

        sc.close();
    }

}
