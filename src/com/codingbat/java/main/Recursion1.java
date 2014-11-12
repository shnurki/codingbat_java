package com.codingbat.java.main;

/**
 * Recursion1
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
public class Recursion1 {

    /**
     * Factorial
     *
     * Given n of 1 or more,
     * return the factorial of n, which is n * (n-1) * (n-2) ... 1.
     * Compute the result recursively (without loops).
     *
     * factorial(1) → 1
     * factorial(2) → 2
     * factorial(3) → 6
     *
     * @param n int
     *
     * @return int
     *
     * @link http://codingbat.com/prob/p154669
     */
    public int factorial(int n) {

        if (n < 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

}
