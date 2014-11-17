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

    @Test
    public void testBunnyEars() {
        assertEquals(0, recursion.bunnyEars(0));
        assertEquals(2, recursion.bunnyEars(1));
        assertEquals(4, recursion.bunnyEars(2));
        assertEquals(6, recursion.bunnyEars(3));
        assertEquals(8, recursion.bunnyEars(4));
        assertEquals(10, recursion.bunnyEars(5));
        assertEquals(24, recursion.bunnyEars(12));
        assertEquals(100, recursion.bunnyEars(50));
        assertEquals(468, recursion.bunnyEars(234));
    }

    @Test
    public void testFibonacci() {
        assertEquals(0, recursion.fibonacci(0));
        assertEquals(1, recursion.fibonacci(1));
        assertEquals(1, recursion.fibonacci(2));
        assertEquals(2, recursion.fibonacci(3));
        assertEquals(3, recursion.fibonacci(4));
        assertEquals(5, recursion.fibonacci(5));
        assertEquals(8, recursion.fibonacci(6));
        assertEquals(13, recursion.fibonacci(7));
    }

    @Test
    public void testBunnyEars2() {
         assertEquals(this.getClass() + " BunnyEars2 - 1", 0, recursion.bunnyEars2(0));
         assertEquals(this.getClass() + " BunnyEars2 - 2", 2, recursion.bunnyEars2(1));
         assertEquals(this.getClass() + " BunnyEars2 - 3", 5, recursion.bunnyEars2(2));
         assertEquals(this.getClass() + " BunnyEars2 - 4", 7, recursion.bunnyEars2(3));
         assertEquals(this.getClass() + " BunnyEars2 - 5", 10, recursion.bunnyEars2(4));
         assertEquals(this.getClass() + " BunnyEars2 - 6", 12, recursion.bunnyEars2(5));
         assertEquals(this.getClass() + " BunnyEars2 - 7", 15, recursion.bunnyEars2(6));
         assertEquals(this.getClass() + " BunnyEars2 - 8", 25, recursion.bunnyEars2(10));
    }

    @Test
    public void testTriangle() {
    }

    @Test
    public void testSumDigits() {
    }

    @Test
    public void testCount7() {
    }

    @Test
    public void testCount8() {
    }

    @Test
    public void testPowerN() {
    }

    @Test
    public void testCountX() {
    }

    @Test
    public void testCountHi() {
    }

    @Test
    public void testChangeXY() {
    }

    @Test
    public void testChangePi() {
    }

    @Test
    public void testNoX() {
    }

    @Test
    public void testArray6() {
    }

    @Test
    public void testArray11() {
    }

    @Test
    public void testArray220() {
    }

    @Test
    public void testAllStar() {
    }

    @Test
    public void testPairStar() {
    }

    @Test
    public void testEndX() {
    }

    @Test
    public void testCountPairs() {
    }

    @Test
    public void testCountAbc() {
    }

    @Test
    public void testCount11() {
    }

    @Test
    public void testStringClean() {
    }

    @Test
    public void testCountHi2() {
    }

    @Test
    public void testParenBit() {
    }

    @Test
    public void testNestParen() {
    }

    @Test
    public void testStrCount() {
    }

    @Test
    public void testStrCopies() {
    }

    @Test
    public void testStrDist() {
    }

    @Before
    public void setUp() {
        recursion = new Recursion1();
    }
}
