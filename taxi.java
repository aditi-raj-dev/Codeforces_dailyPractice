import java.util.Scanner;

public class taxi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] count = new int[5];

        for (int i = 0; i < n; i++) {
            int group = sc.nextInt();
            count[group]++;
        }

        int ones = count[1];
        int twos = count[2];
        int threes = count[3];
        int fours = count[4];

        int taxis = 0;

        // Groups of 4
        taxis += fours;

        // Groups of 3 with groups of 1
        int pair = Math.min(threes, ones);

        taxis += pair;

        threes -= pair;
        ones -= pair;

        // Remaining groups of 3
        taxis += threes;

        // Groups of 2
        taxis += twos / 2;

        twos %= 2;

        // One remaining group of 2
        if (twos == 1) {
            taxis++;

            // Put up to two groups of 1 with it
            ones -= Math.min(2, ones);
        }

        // Remaining groups of 1
        taxis += (ones + 3) / 4;

        System.out.println(taxis);

        sc.close();
    }
}