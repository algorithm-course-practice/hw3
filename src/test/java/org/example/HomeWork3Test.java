package org.example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeWork3Test {

    @Test
    public void hw3Test(){
        HomeWork homeWork = new HomeWork();
        assertEquals("abcd", homeWork.findMaxSubstring("abcddcba"));
        assertEquals("dcbaX", homeWork.findMaxSubstring("abcddcbaX"));
        assertEquals(null, homeWork.findMaxSubstring(null));
        assertEquals("", homeWork.findMaxSubstring(""));
        assertEquals("", homeWork.findMaxSubstring(""));
        assertEquals("a", homeWork.findMaxSubstring("a"));
        assertEquals("a", homeWork.findMaxSubstring("aa"));
        assertEquals("qwertyuiop[]asdfghjkl;zxcvbnm,", homeWork.findMaxSubstring("qwertyuiop[]asdfghjkl;zxcvbnm,"));
        assertEquals("qwertyuiop[]asdfghjkl;zxcvbnm,", homeWork.findMaxSubstring("qwertyuiop[]asdfghjkl;zxcvbnm,qwertyuiolpsdfghjklxcvbnm"));
        assertEquals("qwertyuiop[]asdfghjkl;zxcvbnm,345678", homeWork.findMaxSubstring("qwertyuiop[]asdfghjkl;zxcvbnm,qwertyuiolpsdfghjklxcvbnmqwertyuiop[]asdfghjkl;zxcvbnm,345678"));
    }
}
