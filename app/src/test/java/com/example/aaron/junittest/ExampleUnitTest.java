package com.example.aaron.junittest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void firstTest(){
        assertEquals(4, MathExample.sum(2,2));
    }

    @Test
    public void secondTest(){
        assertEquals(4, MathExample.times(3,3));
    }
}