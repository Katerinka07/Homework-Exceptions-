package ExcHW_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        List<String[]> data = WriteFile.requestData();
        WriteFile.checkInputData(data);
        WriteFile.saveFile(data);
    }
}
class WriteFile {
    public static Scanner scanner = new Scanner(System.in);

    public static List<String[]> requestData() {
        List<String[]> data = new ArrayList<>();
        System.out.println("Введите данные через пробел: фамилию, имя, отчество, дату рождения(в формате dd.mm.yyyy),\n" +
                "номер телефона(11 цифр без пробелов и знаков), пол(латиницей f или m): ");
        String input = scanner.nextLine();
        String[] str = input.split(" ");
        data.add(str);
            if (str.length != 6) {
                throw new IllegalArgumentException(String.format("Необходимо ввести шесть полей данных через пробел, " +
                        "Вы ввели:" + str.length + " значения. Повторите ввод данных"));
            }

        return data;
    }

    public static void saveFile(List<String[]> data) {
        String fileName = "D:/Учеба/Исключения в программировании/Seminar/src/main/java/ExcHW_3/" + data.get(0)[0] + ".txt";
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            for (String[] item : data) {
                writer.write(String.format("%s %s %s %s %s %s\n",item[0], item[1], item[2], item[3], item[4], item[5]));
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка записи в файл");
            System.out.println(Arrays.toString(e.getStackTrace()));

        }

    }

    public static void checkInputData(List<String[]> data) {
        checkFIO(data);
        checkBirthData(data);
        checkNumberPhone(data);
        checkGender(data);

    }
    public static void checkFIO(List<String[]> data) {
        for (String[] item: data) {
            if (item[0].length() < 3){
                throw new IllegalArgumentException("Неверный формат ввода, в фамилии не может быть меньше трех букв");
            }
            if (item[1].length() < 3){
                throw new IllegalArgumentException("Неверный формат ввода, в имени не может быть меньше трех букв");

            }
            if (item[1].length() < 3) {
                throw new IllegalArgumentException("Неверный формат ввода, в отчестве не может быть меньше трех букв");
            }
        }
    }

    public static void checkBirthData(List<String[]> data) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");
        try {
            for (String[] item: data) {
                Date birthdate = formatter.parse(item[3]);
            }
        }catch (ParseException e) {
            System.out.println("Неверный формат даты рождения");
        }
    }

    public static void checkNumberPhone(List<String[]> data) {
        for (String[] item: data) {
            if (item[4].length() != 11 || item[4].charAt(0) != '8')
                throw new IllegalArgumentException("Неверный формат ввода, номер телефона должен содержать 11 цифр и начинаться с '8-ки'");
            try {
                Long.valueOf(item[4]);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода, номер телефона состоит из 11 цифр, без знаков и пробелов");
            }
        }
    }

    public static void checkGender(List<String[]> data) {
        for (String[] item : data) {
            if (!item[5].toLowerCase(Locale.ROOT).equals("f") && !item[5].toLowerCase(Locale.ROOT).equals("m"))
                throw new IllegalArgumentException("Неверный формат ввода, необходимо ввети латиницей f или m)");
        }
    }
}
