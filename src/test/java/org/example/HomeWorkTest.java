package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    @Test
    void findMaxSubstringTest() {

        assertEquals("abcd", HomeWork.findMaxSubstring("abcddcba"));
        assertEquals("dcbaX", HomeWork.findMaxSubstring("abcddcbaX"));
    }

    @Test
    void checkTest() {
        assertTrue(HomeWork.check("The quick brown fox jumps over the lazy dog"));
        assertFalse(HomeWork.check("Hello world!"));
    }
}