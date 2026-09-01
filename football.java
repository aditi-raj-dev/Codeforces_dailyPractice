import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, Integer> goals = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String team = sc.next();

            goals.put(team, goals.getOrDefault(team, 0) + 1);
        }

        String winner = "";
        int maxGoals = 0;

        for (Map.Entry<String, Integer> entry : goals.entrySet()) {

            if (entry.getValue() > maxGoals) {
                maxGoals = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println(winner);

        sc.close();
    }
}