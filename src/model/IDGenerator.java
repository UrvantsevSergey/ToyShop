package model;

public class IDGenerator {
    private static int currentID = 0; // Статический счетчик для хранения текущего ID

    public static String generateID() {
        currentID++; // Увеличиваем счетчик
        return String.valueOf(currentID); // Возвращаем ID как строку
    }
}


