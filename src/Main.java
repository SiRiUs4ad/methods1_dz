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

        boolean toUpperCase = false;
        int start = 0, end = 4;
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Enter text:");
        text = scanner.nextLine();

        System.out.println(formatText(text));
        System.out.println(formatText(text, toUpperCase));
        System.out.println(formatText(text, start, end));


    }
}