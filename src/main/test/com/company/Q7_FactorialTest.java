package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q7_FactorialTest {

    Q7_Factorial testObj;

    @Before
    public void setUp (){
        testObj = new Q7_Factorial();
    }

    @After
    public void tearDown(){
        testObj = null;
    }


    @Test
    public void testCornerCaseFor21(){
        long    expectedValue = -1;
        long    actualValue = testObj.factorial(21);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testFactorial(){

        long    expectedValue = 120;
        long    actualValue = testObj.factorial(5);

        assertEquals(expectedValue, actualValue);
    }



}