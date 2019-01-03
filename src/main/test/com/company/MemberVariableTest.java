package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    MemberVariable testObj;
    final int no_of_students = 4;
    final int[] grades = {86, 65, 98, 77};

    @Before
    public void setUp (){
        testObj = new MemberVariable("sachin", 45, 225000 );
    }

    @After
    public void tearDown(){
        testObj = null;
    }

    @Test
    public  void testNameAgeSalary(){
        String expectedName =  "sachin";
        String actualName = testObj.getName();

        assertEquals(expectedName, actualName);


        int     expectedAge  =  45;
        int     actualAge    =  testObj.getAge();

        assertEquals(expectedAge,actualAge);


        int     expectedSalary  =  225000;
        int     actualSalary   =  testObj.getSalary();

        assertEquals(expectedSalary,actualSalary);

    }


}