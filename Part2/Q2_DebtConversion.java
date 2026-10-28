package Part2;

public class Q2_DebtConversion {
    public static void main(String[] args) {
        long usDebtLong = 34000000000000L;
        int usDebtInt = (int) usDebtLong;
        double usDebtDouble = usDebtLong;
        byte usDebtByte = (byte) usDebtDouble;

        System.out.println("Original Long: " + usDebtLong);
        System.out.println("Converted Int: " + usDebtInt);
        System.out.println("Converted Double: " + usDebtDouble);
        System.out.println("Converted Byte: " + usDebtByte);
    }
}