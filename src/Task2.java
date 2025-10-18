public class Task2 {
//2. Метод containsSubstring(String text, char character), который проверяет, содержится ли символ в строке.
//
//Пример:
//
//containsSubstring("Java Programming", "prog") -> false
//containsSubstring("Java Programming", "Prog", true) -> true
//containsSubstring("Hello", 'e') -> true
//
//Подсказка: Используйте методы contains, indexOf, и toLowerCase.

    public static boolean containsSubstring(String text, String substring) {

        return text.contains(substring);
    }

    public static boolean containsSubstring(String text, String substring, boolean toLowerCase) {

        if (toLowerCase) {
            text = text.toLowerCase();
            substring = substring.toLowerCase();
        }
        return text.contains(substring);
    }

    public static boolean containsSubstring(String text, char substring) {

        return text.indexOf(substring) != -1;
    }


}