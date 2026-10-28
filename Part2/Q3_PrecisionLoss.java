package Part2;

public class Q3_PrecisionLoss {
    public static void main(String[] args) {
        double piDouble = 3.1415926535;
        float piFloat = (float) piDouble;
        System.out.println("Double PI: " + piDouble);
        System.out.println("Float PI:  " + piFloat);

        double money1 = 23.99;
        System.out.println("Dollar with cents: " + money1);

        double money2 = 23.00;
        System.out.println("Dollar without cents: " + money2);
    }
}