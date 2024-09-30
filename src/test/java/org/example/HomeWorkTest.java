package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    @Test
    void findMaxSubstring() {

        HomeWork hw = new HomeWork();

        assertEquals("abcd", hw.findMaxSubstring("abcddcba"));
        assertEquals("dcbaX", hw.findMaxSubstring("abcddcbaX"));
    }

    @Test
    void check() {
        HomeWork hw = new HomeWork();

        assertTrue(hw.check("The quick brown fox jumps over the lazy dog."));
        assertFalse(hw.check("You shall not pass!"));
    }
}