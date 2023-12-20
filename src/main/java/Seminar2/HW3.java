package Seminar2;

public class HW3 {
    class Expr {

        public static double expr(int a, int b) {
            double result = 0.0; // Initialize the result
            if (b != 0) {
                result = (double) a / b; // Perform the division and store the result
            }
            printSum(a, b);
            return result; // Return the result
        }

        public static void printSum(int a, int b) {
            System.out.println(a + b);
        }
    }
}
