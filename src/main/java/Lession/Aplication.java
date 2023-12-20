package Lession;

import java.io.FileReader;
import java.io.IOException;

public class Aplication {
    public static void main(String[] args) {
//        FileReader text = null;
//        try {
//            text = new FileReader("D:/Учеба/Исключения в программировании/Seminar" +
//                    "/src/main/java/Lession/text.txt");
//        } catch (RuntimeException | IOException e) {
//            System.out.println("catch exception" + e.getClass().getSimpleName());
//        } finally {
//            System.out.println("finally start");
//            if (text != null) {
//                try {
//                    text.close();
//                } catch (IOException e) {
//                    System.out.println("exception while close");
//                }
//            }
//            System.out.println("finally finished");
//        }
//    }
        try (FileReader text = new FileReader("D:/Учеба/Исключения в программировании/Seminar" +
                    "/src/main/java/Lession/text.txt")) {
            text.close();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception" + e.getClass().getSimpleName());
        }
        }
}
