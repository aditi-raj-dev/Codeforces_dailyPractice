import java.util.Scanner;

public class strin {

    public static boolean isVowel(char ch) {
        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u' ||
               ch == 'y';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if (!isVowel(ch)) {
                result.append('.');
                result.append(ch);
            }
        }

        System.out.println(result);

        sc.close();
    }
}