package Seminar1;

public class HW1 {
    static class Answer {
        public static void arrayOutOfBoundsException() {
            // Напишите свое решение ниже
            int[]arr = {3, 2, 3, 5, 7};
            System.out.println(arr[10]);
        }

        public static void divisionByZero() {
            // Напишите свое решение ниже
            int a = 5;
            int b = 0;
            System.out.println(a/b);

        }

        public static void numberFormatException() {
            // Напишите свое решение ниже
            System.out.println(Integer.parseInt("AVGT"));

        }
    }

    public class Printer {
        public static void main(String[] args) {
            Answer ans = new Answer();
            try {
                ans.arrayOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за пределы массива");
            }

            try {
                ans.divisionByZero();
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            }

            try {
                ans.numberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования строки в число");
            }
        }
    }
}
