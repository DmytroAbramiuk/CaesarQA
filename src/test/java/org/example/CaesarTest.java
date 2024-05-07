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
    void decryptTestWithAShiftOfTwo(){
        String result = Caesar.decrypt(CORRECT_VALUE_SHIFT_2, 2);
        Assertions.assertEquals(ORIGINAL_TEXT, result);
    }

    @Test
    void encryptTestWithAShiftOfFour(){
        String result = Caesar.encrypt(ORIGINAL_TEXT, 4);
        Assertions.assertEquals(CORRECT_VALUE_SHIFT_4, result);
    }

    @Test
    void decryptTestWithAShiftOfFour(){
        String result = Caesar.decrypt(CORRECT_VALUE_SHIFT_4, 4);
        Assertions.assertEquals(ORIGINAL_TEXT, result);
    }

    @Test
    void performanceTestWith1000Symbols(){
        double startTime, endTime;
        double elapsedTime;

        String textForEncrypt = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown " +
                "printer took a galley of type and scrambled it to make a type specimen book. It has survived " +
                "not only five centuries, but also the leap into electronic typesetting, remaining essentially " +
                "unchanged. It was popularised in the 1960s with the release of Letraset sheets containing " +
                "Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker " +
                "including versions of Lorem Ipsum. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown " +
                "printer took a galley of type and scrambled it to make a type specimen book. It has survived " +
                "not only five centuries, but also the leap into electronic typesetting, remaining essentially " +
                "unchanged. It was popularised in the 1960s with the release of Letraset sheets containing " +
                "Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker " +
                "including versions of Lorem Ipsum.";

        startTime = System.nanoTime();
        Caesar.encrypt(textForEncrypt, 10);
        endTime = System.nanoTime();
        elapsedTime = (endTime-startTime)/1000000.0;
        System.out.println("elapsed time = " + elapsedTime + " ms");

        Assertions.assertTrue(elapsedTime<1);
    }

    @Test
    void performanceTestWith500Symbols(){
        double startTime, endTime;
        double elapsedTime;

        String textForEncrypt = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown " +
                "printer took a galley of type and scrambled it to make a type specimen book. It has survived " +
                "not only five centuries, but also the leap into electronic typesetting, remaining essentially " +
                "unchanged. It was popularised in the 1960s with the release of Letraset sheets containing " +
                "Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker " +
                "including versions of Lorem Ipsum. ";

        startTime = System.nanoTime();
        Caesar.encrypt(textForEncrypt, 10);
        endTime = System.nanoTime();
        elapsedTime = (endTime-startTime)/1000000.0;
        System.out.println("elapsed time = " + elapsedTime + " ms");

        Assertions.assertTrue(elapsedTime<0.5);
    }
}