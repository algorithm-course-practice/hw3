package org.example;

import java.util.*;
import java.util.stream.Collectors;


public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Метод возвращает подстроку максимальной длины в которой не повторяются символы
     * Если найдено несколько подстрок одинаковой длины - вернуть первую.
     *
     * Пример 1 вход= abcddcba, выход = abcd
     * Так как найдены две подстроки с неповторяющимися значениями:
     * 1) abcd
     * 2) dcba
     * Они динаковой длины, по этому возвращаем 1 строку
     *
     * Пример 2 вход= abcddcbaX, выход = dcbaX
     * Так как эта подстрока самая большая
     *
     * @param str входная не пустая строка
     * @return максимальная подстрока из уникальных значений
     * Сигнатуру метода не меняем
     */
    public String findMaxSubstring(String str) {
        if (str == null || str.isEmpty())
            return str;
        char[] charStr = str.toCharArray();
        int begin = 0;
        int size = 1;
        int length = str.length();
        for (int i = 0; i < length - 1; i++) {
            Set<Character> tempCharStr = new HashSet<>();
            tempCharStr.add(charStr[i]);

            for (int j = i + 1; j < length; j++) {
                if (tempCharStr.add(charStr[j])){
                    if (size < j - i + 1){
                        begin = i;
                        size = j - i + 1;
                    }
                }
                else {
                    break;
                }
            }
        }
        return str.substring(begin, begin + size);
    }


    /**
     * Задача со зведочкой (опционально)
     * <br/>
     * Можно решать так же для английского алфавита, проверять что присутствуют буквы от A до Z хотя бы по одному разу.
     * <br/>
     * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
     *
     * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
     * @see <a href="https://www.codewars.com/kata/545cedaa9943f7fe7b000048">https://www.codewars.com/kata/545cedaa9943f7fe7b000048</a>
     */
    public boolean check(String sentence){
        String sen = sentence.replaceAll("\\s+","").toLowerCase();
        if (sen.matches("[a-z]*")){
            char[] charStr = sen.toCharArray();
            Set<Character> temp = new HashSet<>();
            for(Character c  : charStr){
                temp.add(c);
            }
            if (temp.size() == 26){
                return true;
            }
        }
        return false;
    }
}
