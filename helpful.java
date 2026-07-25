import java.util.Arrays;
import java.util.Scanner;

public class helpful {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] arr = new char[(s.length() + 1) / 2];
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '+') {
                arr[index++] = s.charAt(i);
            }
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i != arr.length - 1) {
                System.out.print("+");
            }
        }

        sc.close();
    }
}
