import java.util.*;

public class vanya {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] lanterns = new int[n];

        for (int i = 0; i < n; i++) {
            lanterns[i] = sc.nextInt();
        }

        Arrays.sort(lanterns);

        double answer = 0.0;

        // Distance from beginning of street
        answer = Math.max(answer, lanterns[0]);

        // Distance from end of street
        answer = Math.max(answer, l - lanterns[n - 1]);

        // Maximum gap between consecutive lanterns
        for (int i = 1; i < n; i++) {

            double gap = lanterns[i] - lanterns[i - 1];

            answer = Math.max(answer, gap / 2.0);
        }

        System.out.println(answer);

        sc.close();
    }
}