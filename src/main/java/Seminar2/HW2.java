package Seminar2;

import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {
        int[] intArray;
        int d;
        intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        d = 0;
        double res = expr(intArray, d);
        System.out.println(res);

    }
    public static double expr(int[] intArray, int d) {
        try {
            double n = intArray[8] / d;
            System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + n);
            return n;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            return Float.NaN;
        } catch (ArithmeticException e) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Float.NaN;
        }
    }
}
