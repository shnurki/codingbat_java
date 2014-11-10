package com.codingbat.java.test;

import com.codingbat.java.main.Array1;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Array1Test
 *
 * Basic array problems -- no loops..
 * Use a[0], a[1], ... to access elements in an array,
 * a.length is the length (note that s.length() is for Strings).
 * Allocate a new array like this: int[] a = new int[10]; // length 10 array
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Array-1
 */
public class Array1Test {

    private Array1 arr;

    @Test
    public void testFirstLast6() {
        assertTrue(arr.firstLast6(new int[]{1, 2, 6}));
        assertTrue(arr.firstLast6(new int[]{6, 1, 2, 3}));
        assertFalse(arr.firstLast6(new int[]{13, 6, 1, 2, 3}));
        assertTrue(arr.firstLast6(new int[]{13, 6, 1, 2, 6}));
        assertFalse(arr.firstLast6(new int[]{3, 2, 1}));
        assertFalse(arr.firstLast6(new int[]{3, 6, 1}));
        assertTrue(arr.firstLast6(new int[]{3, 6}));
        assertTrue(arr.firstLast6(new int[]{6}));
        assertFalse(arr.firstLast6(new int[]{3}));
        assertTrue(arr.firstLast6(new int[]{5, 6}));
        assertFalse(arr.firstLast6(new int[]{5, 5}));
        assertTrue(arr.firstLast6(new int[]{1, 2, 3, 4, 6}));
        assertFalse(arr.firstLast6(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testSameFirstLast() {
        assertFalse(arr.sameFirstLast(new int[]{1, 2, 3}));
        assertTrue(arr.sameFirstLast(new int[]{1, 2, 3, 1}));
        assertTrue(arr.sameFirstLast(new int[]{1, 2, 1}));
        assertTrue(arr.sameFirstLast(new int[]{7}));
        assertFalse(arr.sameFirstLast(new int[]{}));
        assertTrue(arr.sameFirstLast(new int[]{1, 2, 3, 4, 5, 1}));
        assertFalse(arr.sameFirstLast(new int[]{1, 2, 3, 4, 5, 13}));
        assertTrue(arr.sameFirstLast(new int[]{13, 2, 3, 4, 5, 13}));
        assertTrue(arr.sameFirstLast(new int[]{7, 7}));
    }

    @Test
    public void testMakePi() {
        assertArrayEquals(new int[]{3, 1, 4}, arr.makePi());
    }

    @Test
    public void testCommonEnd() {
        assertTrue(arr.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        assertFalse(arr.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        assertTrue(arr.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
        assertTrue(arr.commonEnd(new int[]{1, 2, 3}, new int[]{1}));
        assertFalse(arr.commonEnd(new int[]{1, 2, 3}, new int[]{2}));
    }

    @Test
    public void testSum3() {
        assertEquals(6, arr.sum3(new int[]{1, 2, 3}));
        assertEquals(18, arr.sum3(new int[]{5, 11, 2}));
        assertEquals(7, arr.sum3(new int[]{7, 0, 0}));
        assertEquals(4, arr.sum3(new int[]{1, 2, 1}));
        assertEquals(3, arr.sum3(new int[]{1, 1, 1}));
        assertEquals(11, arr.sum3(new int[]{2, 7, 2}));
    }

    @Test
    public void testRotateLeft3() {
        assertArrayEquals(new int[]{2, 3, 1}, arr.rotateLeft3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{11, 9, 5}, arr.rotateLeft3(new int[]{5, 11, 9}));
        assertArrayEquals(new int[]{0, 0, 7}, arr.rotateLeft3(new int[]{7, 0, 0}));
        assertArrayEquals(new int[]{2, 1, 1}, arr.rotateLeft3(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{0, 1, 0}, arr.rotateLeft3(new int[]{0, 0, 1}));
    }

    @Test
    public void testReverse3() {
        assertArrayEquals(new int[]{3, 2, 1}, arr.reverse3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{9, 11, 5}, arr.reverse3(new int[]{5, 11, 9}));
        assertArrayEquals(new int[]{0, 0, 7}, arr.reverse3(new int[]{7, 0, 0}));
        assertArrayEquals(new int[]{2, 1, 2}, arr.reverse3(new int[]{2, 1, 2}));
        assertArrayEquals(new int[]{1, 2, 1}, arr.reverse3(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{3, 11, 2}, arr.reverse3(new int[]{2, 11, 3}));
        assertArrayEquals(new int[]{5, 6, 0}, arr.reverse3(new int[]{0, 6, 5}));
        assertArrayEquals(new int[]{3, 2, 7}, arr.reverse3(new int[]{7, 2, 3}));
    }

    @Before
    public void setUp() {
        arr = new Array1();
    }
}
