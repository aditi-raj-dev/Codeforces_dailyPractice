import java.util.Scanner;

public class Polyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int total = 0;

        for (int i = 0; i < n; i++) {
            String shape = sc.next();

            if (shape.equals("Tetrahedron")) {
                total += 4;
            } else if (shape.equals("Cube")) {
                total += 6;
            } else if (shape.equals("Octahedron")) {
                total += 8;
            } else if (shape.equals("Dodecahedron")) {
                total += 12;
            } else if (shape.equals("Icosahedron")) {
                total += 20;
            }
        }

        System.out.println(total);

        sc.close();
    }
}