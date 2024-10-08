package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    @Test
    void findMaxSubstring() {
        HomeWork homeWork = new HomeWork();
        assertEquals("abcd", homeWork.findMaxSubstring("abcddcba"));
        assertEquals("abcdX", homeWork.findMaxSubstring("abcddcbaX"));
    }
}