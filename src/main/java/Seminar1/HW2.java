package Seminar1;

import java.util.Arrays;

public class HW2 {
    public static int[] subArrays(int[] a, int[] b){
        if (a.length == b.length) {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length ; i++) {
                c[i] = a[i] - b[i];
            }
            return c;
        }
        return new int[]{0};

    }

    public static void main(String[] args) {
        int[] a = new int[]{4, 5, 6};
        int[] b = new int[]{1, 2};
        String res = Arrays.toString(subArrays(a,b));
        System.out.println(res);


    }
}
