package Seminar1;
/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
 Если длина массива меньше некоторого заданного минимума,
 метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

 */
public class Task1 {
    public static void main(String[] args) {
        int[] ints = {1,3,6,7};
        System.out.println(getSize(ints, 2));

    }
    public static int getSize(int[] arr, int minLength){
        if (arr.length < minLength) return -1;
        return arr.length;

    }
}
