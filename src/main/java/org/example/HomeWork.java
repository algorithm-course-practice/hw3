package org.example;

import java.util.HashSet;
import java.util.Set;


public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Метод возвращает подстроку максимальной длины в которой не повторяются символы
     * Если найдено несколько подстрок одинаковой длины - вернуть первую.
     * <p>
     * Пример 1 вход= abcddcba, выход = abcd
     * Так как найдены две подстроки с неповторяющимися значениями:
     * 1) abcd
     * 2) dcba
     * Они динаковой длины, по этому возвращаем 1 строку
     * <p>
     * Пример 2 вход= abcddcbaX, выход = dcbaX
     * Так как эта подстрока самая большая
     *
     * @param str входная не пустая строка
     * @return максимальная подстрока из уникальных значений
     * Сигнатуру метода не меняем
     */
    public static String findMaxSubstring(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        int start = 0;
        int maxLength = 0;
        int maxStart = 0;
        Set<Character> uniqueChars = new HashSet<>();

        for (int end = 0; end < str.length(); end++) {
            char currentChar = str.charAt(end);

            while (uniqueChars.contains(currentChar)) {
                uniqueChars.remove(str.charAt(start));
                start++;
            }

            uniqueChars.add(currentChar);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }
        return str.substring(maxStart, maxStart + maxLength);
    }


    /**
     * Задача со зведочкой (опционально)
     * <br/>
     * Можно решать так же для английского алфавита, проверять что присутствуют буквы от A до Z хотя бы по одному разу.
     * <br/>
     * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
     * <p>
     * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
     *
     * @see <a href="https://www.codewars.com/kata/545cedaa9943f7fe7b000048">https://www.codewars.com/kata/545cedaa9943f7fe7b000048</a>
     */
    public static boolean check(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        Set<Character> letters = new HashSet<>();

        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }
        //english alphabet has 26 letters
        return letters.size() == 26;
    }

}
