package com.codingbat.java.test;

import com.codingbat.java.main.Recursion1;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Recursion1Test
 *
 * Basic recursion problems.
 * Recursion strategy: first test for one or two base cases that are so simple,
 * the answer can be returned immediately.
 * Otherwise, make a recursive a call for a smaller case
 * (that is, a case which is a step towards the base case).
 * Assume that the recursive call works correctly,
 * and fix up what it returns to make the answer.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Recursion-1
 */
public class Recursion1Test {

    private Recursion1 recursion;

    @Test
    public void testFactorial() {
        assertEquals("Recursion Factorial - 1", 1, recursion.factorial(1));
        assertEquals("Recursion Factorial - 2", 2, recursion.factorial(2));
        assertEquals("Recursion Factorial - 3", 6, recursion.factorial(3));
        assertEquals("Recursion Factorial - 4", 24, recursion.factorial(4));
        assertEquals("Recursion Factorial - 5", 120, recursion.factorial(5));
        assertEquals("Recursion Factorial - 6", 720, recursion.factorial(6));
        assertEquals("Recursion Factorial - 7", 5040, recursion.factorial(7));
        assertEquals("Recursion Factorial - 8", 40320, recursion.factorial(8));
        assertEquals("Recursion Factorial - 12", 479001600, recursion.factorial(12));
    }

    @Before
    public void setUp() {
        recursion = new Recursion1();
    }
}
