package Seminar3;

public class Task4 {
    public static int sumArray(String [][] arr) {
        int sum = 0;
        if (arr.length != 4)
            throw new MyArraySizeException(arr.length, arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length !=4)
                throw new MyArraySizeException(arr.length, arr[i].length);
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
                
            }
        }
        return sum;

    }
}
class MyArraySizeException extends RuntimeException {
    public MyArraySizeException (int row, int colum) {
        super("Массив должен быть 4*4, размер вашего массива -> " + row +"*"+colum);
    }
    public MyArraySizeException() {
        super("Массив должен быть 4*4, размер вашего массива");
    }
}
class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException() {
        super("В каком-то элемен массива преобразование не удалось");
    }
    public MyArrayDataException(int i, int j) {
        super("Преобразование не удалось, индексы ->" + i+":"+ j );
    }
}
