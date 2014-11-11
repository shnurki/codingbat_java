package com.codingbat.java.test;

import com.codingbat.java.main.Array2;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Array2Test
 *
 * Medium array problems -- 1 loop.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Array-2
 */
public class Array2Test {

    private Array2 arr;

    @Test
    public void testCountEvens() {
        assertEquals(3, arr.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, arr.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, arr.countEvens(new int[]{1, 3, 5}));
        assertEquals(0, arr.countEvens(new int[]{}));
        assertEquals(1, arr.countEvens(new int[]{11, 9, 0, 1}));
        assertEquals(2, arr.countEvens(new int[]{2, 11, 9, 0}));
        assertEquals(1, arr.countEvens(new int[]{2}));
        assertEquals(2, arr.countEvens(new int[]{2, 5, 12}));
    }


    @Before
    public void setUp() {
        arr = new Array2();
    }
}
