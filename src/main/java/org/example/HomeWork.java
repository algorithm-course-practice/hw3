package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


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
    public String findMaxSubstring(String str) {
        //TODO реализовать метод
        return getSubString(str).stream().max((s1, s2) -> s1.length() - s2.length()).get();
    }

    private static List<String> getSubString(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (charCount.containsKey(str.charAt(i))) {
                fillString(str, charCount, list, i);
            } else {
                charCount.put(str.charAt(i), 1);
            }
        }
        fillString(str, charCount, list, str.length() - 1);
        return list;
    }

    private static void fillString(String str, HashMap<Character, Integer> charCount, List<String> list, int i) {
        List<String> keyList = charCount.keySet().stream().map(Object::toString).collect(Collectors.toList());
        String temp = String.join("", keyList);
        list.add(temp);
        charCount.clear();
        charCount.put(str.charAt(i), 1);
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
    public boolean check(String sentence) {
        return false;
    }

}
