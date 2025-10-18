public class Task5 {
    //Задача 5: Обрезка пробелов и перевод регистра
    //
    //Описание: Напишите метод trimAndConvertCase, который принимает строку, обрезает пробелы в начале и в конце, и переводит её в верхний регистр.
    //
    //Добавьте перегруженные методы:
    // 1. Метод trimAndConvertCase(String text, boolean toUpperCase), который переводит строку в верхний или нижний регистр в зависимости от значения toUpperCase.
    // 2. Метод trimAndConvertCase(String text, boolean toUpperCase, boolean removeAllSpaces), который, помимо обрезки пробелов в начале и конце, удаляет все пробелы в строке, если removeAllSpaces равно true.
    //
    //Пример:
    //
    //trimAndConvertCase("   Java   ") -> "JAVA"
    //trimAndConvertCase("   Java   ", false) -> "java"
    //trimAndConvertCase("   Java Programming   ", true, true) -> "JAVAPROGRAMMING"
    //
    //Подсказка: Используйте методы trim, toUpperCase, toLowerCase, и replace.

    public static String trimAndConvertCase(String text) {

        return text.trim().toUpperCase();
    }

    public static String trimAndConvertCase(String text, boolean toUpperCase) {
        text = text.trim();

        if (toUpperCase) {
            return text.toUpperCase();
        } else {
            return text.toLowerCase();
        }
    }

    public static String trimAndConvertCase(String text, boolean toUpperCase, boolean removeAllSpaces) {
        text = text.trim();

        if (removeAllSpaces) {
            text = text.replace(" ", "");
        }

        if (toUpperCase) {
            return text.toUpperCase();
        } else {
            return text.toLowerCase();
        }
    }
}
