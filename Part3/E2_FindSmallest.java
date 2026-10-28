package Part3;

import java.util.Scanner;

public class E2_FindSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        System.out.print("Num 1: ");
        int a = scanner.nextInt();
        System.out.print("Num 2: ");
        int b = scanner.nextInt();
        System.out.print("Num 3: ");
        int c = scanner.nextInt();

        int smallest = Math.min(a, Math.min(b, c));
        System.out.println("The smallest number is: " + smallest);
        scanner.close();
    }
}