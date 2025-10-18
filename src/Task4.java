public class Task4 {
    //Задача 4: Поиск слова в строке
    //
    //Описание: Напишите метод findWord, который принимает текст и слово и возвращает индекс первого вхождения слова в тексте. Если слово не найдено, метод возвращает -1.
    //
    //Добавьте перегруженные методы:
    // 1. Метод findWord(String text, String word, boolean ignoreCase), который ищет слово, игнорируя регистр, если ignoreCase равно true.
    // 2. Метод findWord(String text, char character), который возвращает индекс первого вхождения символа в тексте.
    //
    //Пример:
    //
    //findWord("Java Programming", "Program") -> 5
    //findWord("Java Programming", "program", true) -> 5
    //findWord("Hello", 'o') -> 4
    //
    //Подсказка: Используйте indexOf и toLowerCase.

    public static int findWord(String text, String word) {

        return text.indexOf(word);
    }

    public static int findWord(String text, String word, boolean ignoreCase) {
        if (ignoreCase) {
            text = text.toLowerCase();
            word = word.toLowerCase();
        }
        return text.indexOf(word);
    }

    public static int findWord(String text, char character) {

        return text.indexOf(character);
    }

}
