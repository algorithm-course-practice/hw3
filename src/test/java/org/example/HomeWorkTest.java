package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    HomeWork homeWork = new HomeWork();
    @Test
    void findMaxSubstring() {


        assertEquals("abcd", homeWork.findMaxSubstring("abcddcba"));
        assertEquals("dcbaX", homeWork.findMaxSubstring("abcddcbaX"));
    }

    @Test
    void letterTest(){
        assertTrue(homeWork.check("The quick brown fox jumps over the lazy dog"));
        assertTrue(homeWork.check("The quick brown fox jumps over the lazy dog sdg try yer yeryyty  treh"));

        assertFalse(homeWork.check("The quick brown fox jumps over the lazy dog2141234"));
        assertFalse(homeWork.check("asdfqwerfghgk"));
    }


}