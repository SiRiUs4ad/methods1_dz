public class Task6 {
    //Задача 6: Конструктор текста из слов
    //
    //Описание: Напишите метод buildText, который принимает массив строк и объединяет их в одно предложение.
    //
    //Добавьте перегруженные методы:
    // 1. Метод buildText(String[] words, String separator), который соединяет слова с указанным разделителем.
    // 2. Метод buildText(String[] words, String separator, boolean capitalizeFirstLetter), который дополнительно

    public static String buildText(String[] words) {

        return String.join(" ", words);
    }

    public static String buildText(String[] words, String separator) {

        return String.join(separator, words);
    }

    public static String buildText(String[] words, String separator, boolean capitalizeFirstLetter) {
        String result = String.join(separator, words);

        if (capitalizeFirstLetter && result.length() > 0) {
            result = result.substring(0, 1).toUpperCase() + result.substring(1);
        }

        return result;
    }

}
