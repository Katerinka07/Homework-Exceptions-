package Seminar2;

public class HW4 {
    public static void main(String[] args) {
        char a;
        a = ' ';
        try {
            String result = expr(a);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
    public static String expr(char a) throws Exception {
       if (a == ' ')
           throw new Exception("Пустая строка введена.");
       return String.format("Your input was - %s", a);
    }
}
