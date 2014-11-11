package com.codingbat.java.main;

/**
 * Array2
 *
 * Medium array problems -- 1 loop.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Array-2
 */
public class Array2 {

    /**
     * Count Evens
     *
     * Return the number of even ints in the given array.
     * Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
     *
     * countEvens({2, 1, 2, 3, 4}) → 3
     * countEvens({2, 2, 0}) → 3
     * countEvens({1, 3, 5}) → 0
     *
     * @param nums int[]
     *
     * @return int
     *
     * @link http://codingbat.com/prob/p162010
     */
    public int countEvens(int[] nums) {

        int count = 0;

        if (nums.length != 0) {
            for (int num : nums) {
                if (num % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }

}
