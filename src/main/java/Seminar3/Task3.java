package Seminar3;

import java.io.FileNotFoundException;

public class Task3 {
}

class DivByZero extends ArithmeticException {
    public DivByZero() {
        super("Деление на 0 запрещено");
    }
}

class NullPointerArray extends NullPointerException {
    public NullPointerArray(int index) {
        super("Обращение к путому элементу массива запрещено, индекс элемента: " + index);
    }

    public NullPointerArray() {
        super("Обращение к путому элементу массива запрещено");
    }
}

class NotFile extends FileNotFoundException {
    public NotFile(String patch) {
        super("Открыть несуществующий файл нельзя, путь к файлу: " + patch);
    }
    public NotFile() {
        super("Открыть несуществующий файл нельзя");
    }


}

