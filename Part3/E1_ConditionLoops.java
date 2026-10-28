package Part3;

import java.util.Scanner;

public class E1_ConditionLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 24: ");
        int time = scanner.nextInt();
        if (time < 18 && time >= 1) {
            System.out.println("Good day");
        } else if (time >= 18 && time <= 24) {
            System.out.println("Good evening");
        }

        System.out.println("\nMultiples of 5 between 10 and 95:");
        int i = 10;
        while (i <= 95) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

        int sum = 0;
        int j = 1;
        while (j <= 10) {
            sum += j;
            j++;
        }
        System.out.println("\nSum of values 1 to 10: " + sum);
        
        scanner.close();
    }
}