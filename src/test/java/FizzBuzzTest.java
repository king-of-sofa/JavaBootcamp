package lesson3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {




    @Test
    public void fizzBuzz() {
        FizzBuzz testfb = new FizzBuzz();
        String actualResult = testfb.fizzBuzz(3);
        assertEquals(actualResult, "fizz");
    }

    @Test
    public void fizzBuzz1() {
        FizzBuzz testfb = new FizzBuzz();
        String actualResult = testfb.fizzBuzz(3);
        assertEquals(actualResult, "fizz");
    }

    @Test
    public void fizzBuzz2() {
        FizzBuzz testfb = new FizzBuzz();
        String actualResult = testfb.fizzBuzz(15);
        assertEquals(actualResult, "fizzbuzz");
    }

}