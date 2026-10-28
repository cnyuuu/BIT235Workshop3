package Part3;

import java.util.Scanner;

public class E3_NumberToLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 35: ");
        int num = scanner.nextInt();

        if (num >= 0 && num <= 9) {
            System.out.println("Output: " + num);
        } else if (num >= 10 && num <= 35) {
            char letter = (char) (num - 10 + 65);
            System.out.println("Output: " + letter);
        } else {
            System.out.println("Invalid input!");
        }
        scanner.close();
    }
}