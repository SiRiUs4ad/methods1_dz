public class Task3 {
    //Задача 3: Замена символов
    //
    //Описание: Напишите метод replaceCharacter, который заменяет все вхождения заданного символа в строке другим символом.
    //
    //Добавьте перегрузки:
    // 1. Метод replaceCharacter(String text, char oldChar, char newChar), который заменяет один символ на другой.
    // 2. Метод replaceCharacter(String text, char oldChar, String newString), который заменяет символ на строку.
    // 3. Метод replaceCharacter(String text, String oldString, String newString), который заменяет одну подстроку на другую.
    //
    //Пример:
    //
    //replaceCharacter("banana", 'a', 'o') -> "bonono"
    //replaceCharacter("banana", 'a', "123") -> "b123n123n123"
    //replaceCharacter("banana", "na", "NA") -> "baNANA"
    //
    //Подсказка: Используйте методы replace и replaceAll.

    public static String replaceCharacter(String text, char oldChar, char newChar) {

        return text.replace(oldChar, newChar);
    }

    public static String replaceCharacter(String text, char oldChar, String newString) {

        return text.replace(String.valueOf(oldChar), newString);
    }

    public static String replaceCharacter(String text, String oldString, String newString) {

        return text.replace(oldString, newString);
    }

}
