package Seminar2;

public class HW1 {
    public static void main(String[] args) {
        String input = "hggj";
        float res = isFloat(input);
        System.out.println(res);

    }
    public static float isFloat(String input) {
        try {
            return Float.parseFloat(input);
        } catch (NumberFormatException e) {
            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN;
        }

    }
}
