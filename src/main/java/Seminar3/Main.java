package Seminar3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        try (Counter counter = new Counter()){
//            counter.add();
//            counter.add();
//            counter.add();
//            System.out.println(counter.getCount());
//            counter.close();
//            counter.add();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            System.out.println(div(5,0));
//        } catch (DivByZero e) {
//            System.out.println(e.getMessage());
//        }
//
//
//
//    }
//    public static double div(int a, int b) {
//        if (b == 0)
//            throw new DivByZero();
//        return (double) a / b;
//    }
//
//    public static void findFile(String patch) throws NotFile {
//        try (FileReader f = new FileReader(patch)){
//            int a = 5;
//
//        } catch (FileNotFoundException e) {
//            throw new NotFile(patch);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
        String[][] array = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "hkkfdss", "4"},
                {"1", "2", "3", "4"}};
        try {
            System.out.println(Task4.sumArray(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }
}
