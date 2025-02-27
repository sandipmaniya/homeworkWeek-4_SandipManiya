package homework_week_8;

import java.util.Scanner;

public class Programme3_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scanner.next();

        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char ch = input.charAt(0);

            ch = Character.toLowerCase(ch);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Error: Input should be a single alphabet letter.");
        }

        scanner.close();
    }
}
