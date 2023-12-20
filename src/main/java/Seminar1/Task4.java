package Seminar1;

public class Task4 {
    public static void main(String[] args) {
        Integer[] test = {1, 3, 4, 5, 9 ,null, 7};
        checkNull(test);

    }
    public static void checkNull(Integer[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                result.append(i).append(" ");

        }
        if (!result.isEmpty())
            throw new RuntimeException("В списке есть null, их индекcы:" + result);
    }
}
