import java.util.*;

public class kefacompany {

    static class Friend {
        int money;
        int friendship;

        Friend(int money, int friendship) {
            this.money = money;
            this.friendship = friendship;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        Friend[] friends = new Friend[n];

        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int friendship = sc.nextInt();

            friends[i] = new Friend(money, friendship);
        }

        Arrays.sort(friends, (a, b) -> a.money - b.money);

        long currentSum = 0;
        long answer = 0;

        int left = 0;

        for (int right = 0; right < n; right++) {

            currentSum += friends[right].friendship;

            while (friends[right].money - friends[left].money >= d) {
                currentSum -= friends[left].friendship;
                left++;
            }

            answer = Math.max(answer, currentSum);
        }

        System.out.println(answer);

        sc.close();
    }
}