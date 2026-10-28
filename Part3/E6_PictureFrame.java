package Part3;

import java.util.Scanner;

public class E6_PictureFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the picture (inches): ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the picture (inches): ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.print("Enter frame type (1 for Regular, 2 for Fancy): ");
        int frameType = scanner.nextInt();
        
        System.out.print("Do you want to color the frame? (true/false): ");
        boolean colorChoice = scanner.nextBoolean();
        
        System.out.print("How many crowns do you want? (Enter 0 if none): ");
        int crowns = scanner.nextInt();

        double frameCost = 0;
        if (frameType == 1) {
            frameCost = perimeter * 0.15;
        } else if (frameType == 2) {
            frameCost = perimeter * 0.25;
        }

        double colorCost = 0;
        if (colorChoice) {
            colorCost = perimeter * 0.10;
        }

        double crownCost = crowns * 0.35;

        double totalCost = frameCost + colorCost + crownCost;

        System.out.printf("The total cost of framing the picture is: $%.2f%n", totalCost);
        
        scanner.close();
    }
}