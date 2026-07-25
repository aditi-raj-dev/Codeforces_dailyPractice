import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of lines =");
        int n = sc.nextInt();
        String[] arr = new String[n];
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter %d word= ", i);
            String w = sc.nextLine();
            arr[i - 1] = w;
        }

        for (int j = 0; j < arr.length; j++) {
            int count = 0;
            if (arr[j].length() > 10) {
                char m = ' ';
                char k = ' ';
                for (int z = 0; z < arr[j].length(); z++) {
                    if (z == 0) {
                        m = arr[j].charAt(z);
                    } else if (z == (arr[j].length() - 1)) {
                        k = arr[j].charAt(z);
                    } else {
                        count += 1;
                    }
                }
                System.out.println("" + m + count + k);
            } else {
                System.out.println(arr[j]);
            }

        }
        sc.close();
    }
}