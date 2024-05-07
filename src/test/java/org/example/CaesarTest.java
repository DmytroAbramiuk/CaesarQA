package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CaesarTest {
    public static final String ORIGINAL_TEXT = "hello";
    public static final String CORRECT_VALUE_SHIFT_2 = "jgnnq";
    public static final String CORRECT_VALUE_SHIFT_4 = "lipps";

    @Test
    void encryptTestWithAShiftOfTwo(){
        String result = Caesar.encrypt(ORIGINAL_TEXT, 2);
        Assertions.assertEquals(CORRECT_VALUE_SHIFT_2, result);
    }

    @Test
    void encryptTestWithAShiftOfFour(){
        String result = Caesar.encrypt(ORIGINAL_TEXT, 4);
        Assertions.assertEquals(CORRECT_VALUE_SHIFT_4, result);
    }
}