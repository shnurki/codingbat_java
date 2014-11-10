package com.codingbat.java.main;

/**
 * Array1
 *
 * Basic array problems -- no loops..
 * Use a[0], a[1], ... to access elements in an array,
 * a.length is the length (note that s.length() is for Strings).
 * Allocate a new array like this: int[] a = new int[10]; // length 10 array
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Array-1
 */
public class Array1 {

    /**
     * First Last 6
     *
     * Given an array of ints,
     * return true if 6 appears as either the first or last element in the array.
     * The array will be length 1 or more.
     *
     * firstLast6({1, 2, 6}) → true
     * firstLast6({6, 1, 2, 3}) → true
     * firstLast6({13, 6, 1, 2, 3}) → false
     *
     * @param nums int[]
     *
     * @return boolean
     *
     * @link http://codingbat.com/prob/p185685
     */
    public boolean firstLast6(int[] nums) {
        return (6 == nums[0] || 6 == nums[nums.length - 1]);
    }

    /**
     * Same First Last
     *
     * Given an array of ints,
     * return true if the array is length 1 or more,
     * and the first element and the last element are equal.
     *
     * sameFirstLast({1, 2, 3}) → false
     * sameFirstLast({1, 2, 3, 1}) → true
     * sameFirstLast({1, 2, 1}) → true
     *
     * @param nums int[]
     *
     * @return boolean
     *
     * @link http://codingbat.com/prob/p118976
     */
    public boolean sameFirstLast(int[] nums) {
        return 0 != nums.length && (nums[0] == nums[nums.length - 1]);
    }

    /**
     * Make Pi
     *
     * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
     *
     * makePi() → {3, 1, 4}
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p167011
     */
    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    /**
     * Common End
     *
     * Given 2 arrays of ints, a and b,
     * return true if they have the same first element or they have the same last element.
     * Both arrays will be length 1 or more.
     *
     * commonEnd({1, 2, 3}, {7, 3}) → true
     * commonEnd({1, 2, 3}, {7, 3, 2}) → false
     * commonEnd({1, 2, 3}, {1, 3}) → true
     *
     * @param a int[]
     * @param b int[]
     *
     * @return boolean
     *
     * @link http://codingbat.com/prob/p191991
     */
    public boolean commonEnd(int[] a, int[] b) {
        return !(a.length == 0 || b.length == 0) && (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    /**
     * Sum 3
     *
     * Given an array of ints length 3, return the sum of all the elements.
     *
     * sum3({1, 2, 3}) → 6
     * sum3({5, 11, 2}) → 18
     * sum3({7, 0, 0}) → 7
     *
     * @param nums int[]
     *
     * @return int
     *
     * @link http://codingbat.com/prob/p175763
     */
    public int sum3(int[] nums) {

        int sum3 = 0;

        for (int num : nums) {
            sum3 += num;
        }

        return sum3;
    }

    /**
     * Rotate Left 3
     *
     * Given an array of ints length 3,
     * return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     *
     * rotateLeft3({1, 2, 3}) → {2, 3, 1}
     * rotateLeft3({5, 11, 9}) → {11, 9, 5}
     * rotateLeft3({7, 0, 0}) → {0, 0, 7}
     *
     * @param nums int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p185139
     */
    public int[] rotateLeft3(int[] nums) {

        int temp = nums[0];

/*        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }*/

        System.arraycopy(nums, 1, nums, 0, nums.length - 1);

        nums[nums.length - 1] = temp;

        return nums;
    }

    /**
     * Reverse 3
     * Given an array of ints length 3,
     * return a new array with the elements in reverse order,
     * so {1, 2, 3} becomes {3, 2, 1}.
     *
     * reverse3({1, 2, 3}) → {3, 2, 1}
     * reverse3({5, 11, 9}) → {9, 11, 5}
     * reverse3({7, 0, 0}) → {0, 0, 7}
     *
     * @param nums int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p112409
     */
    public int[] reverse3(int[] nums) {

        int[] reversArray = new int[nums.length];
        int count = nums.length - 1;

        for (int num : nums) {
            reversArray[count] = num;
            count--;
        }

        return reversArray;
    }


}
