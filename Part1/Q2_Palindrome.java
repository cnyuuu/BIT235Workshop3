import java.util.Scanner;

public class Q2_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check if it's a palindrome: ");
        String input = scanner.nextLine();

        StringBuffer sb = new StringBuffer(input);
        String reversed = sb.reverse().toString();

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println(input + " is a palindrome!");
        } else {
            System.out.println(input + " is NOT a palindrome.");
        }
        scanner.close();
    }
}