import java.util.Arrays;
import java.util.Scanner;

public class dragons {

    static class Dragon {
        int strength;
        int bonus;

        Dragon(int strength, int bonus) {
            this.strength = strength;
            this.bonus = bonus;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        Dragon[] dragons = new Dragon[n];

        for (int i = 0; i < n; i++) {
            int strength = sc.nextInt();
            int bonus = sc.nextInt();

            dragons[i] = new Dragon(strength, bonus);
        }

        Arrays.sort(dragons, (a, b) -> a.strength - b.strength);

        for (Dragon dragon : dragons) {

            if (s <= dragon.strength) {
                System.out.println("NO");
                sc.close();
                return;
            }

            s += dragon.bonus;
        }

        System.out.println("YES");

        sc.close();
    }
}