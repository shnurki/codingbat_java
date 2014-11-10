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

    @Before
    public void setUp() {
        recursion = new Recursion1();
    }
}
