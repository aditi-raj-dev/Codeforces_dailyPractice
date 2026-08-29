import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class gram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        HashMap<String, Integer> frequency = new HashMap<>();

        String answer = "";
        int maxFrequency = 0;

        for (int i = 0; i < n - 1; i++) {

            String pair = s.substring(i, i + 2);

            int count = frequency.getOrDefault(pair, 0) + 1;

            frequency.put(pair, count);

            if (count > maxFrequency) {
                maxFrequency = count;
                answer = pair;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}