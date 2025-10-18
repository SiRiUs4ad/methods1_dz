import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //        Задача 1: Форматирование текста
//
//        Описание: Напишите набор перегруженных методов formatText:
//        1. Метод formatText(String text), который возвращает текст, переведённый в верхний регистр.
//        2. Метод formatText(String text, boolean toUpperCase), который возвращает текст, переведённый в верхний регистр, если toUpperCase равно true, и в нижний регистр, если toUpperCase равно false.
//        3. Метод formatText(String text, int start, int end), который возвращает подстроку, начиная с индекса start и заканчивая end,
//        переведённую в верхний регистр.
//
//                Пример:
//
//        formatText("hello") -> "HELLO"
//        formatText("HELLO", false) -> "hello"
//        formatText("java programming", 0, 4) -> "JAVA"
//
//        Подсказка: Используйте методы toUpperCase, toLowerCase, и substring.
    public static String formatText(String text) {
        return text.toUpperCase();
    }

    public static String formatText(String text, boolean toUpperCase) {
        if (toUpperCase) {
            return text.toUpperCase();
        } else {
            return text.toLowerCase();
        }
    }

    public static String formatText(String text, int start, int end) {

        return text.substring(start, end).toUpperCase();
    }

    public static void main(String[] args) {

        // Task1
        System.out.println(formatText("hello"));
        System.out.println(formatText("HELLO", false));
        System.out.println(formatText("java programming", 0, 4));

        // Task2
        System.out.println(Task2.containsSubstring("Java Programming", "prog"));
        System.out.println(Task2.containsSubstring("Java Programming", "Prog", true));
        System.out.println(Task2.containsSubstring("Hello", 'e'));

        // Task3
        System.out.println(Task3.replaceCharacter("banana", 'a', 'o'));
        System.out.println(Task3.replaceCharacter("banana", 'a', "123"));
        System.out.println(Task3.replaceCharacter("banana", "na", "NA"));

        // Task4
        System.out.println(Task4.findWord("Java Programming", "Program"));
        System.out.println(Task4.findWord("Java Programming", "program", true));
        System.out.println(Task4.findWord("Hello", 'o'));
        System.out.println(Task4.findWord("Hello", 'x'));

        // Task5
        System.out.println(Task5.trimAndConvertCase("   Java   "));
        System.out.println(Task5.trimAndConvertCase("   Java   ", false));
        System.out.println(Task5.trimAndConvertCase("   Java Programming   ", true, true));

        // Task6
        String[] words = {"java", "is", "awesome"};

        System.out.println(Task6.buildText(words));
        System.out.println(Task6.buildText(words, "-"));
        System.out.println(Task6.buildText(words, " ", true));

    }
}