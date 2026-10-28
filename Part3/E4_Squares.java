package Part3;

public class E4_Squares {
    public static void main(String[] args) {
        int sumOfSquares = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += (i * i);
        }
        System.out.println("Sum of squares 1 to 100: " + sumOfSquares);

        System.out.print("Perfect squares between 1 and 100: ");
        for (int i = 1; i <= 100; i++) {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}