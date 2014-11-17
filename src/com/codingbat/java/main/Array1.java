package com.codingbat.java.main;

import java.util.Arrays;

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
     * firstLast6({1, 2, 6}) -> true
     * firstLast6({6, 1, 2, 3}) -> true
     * firstLast6({13, 6, 1, 2, 3}) -> false
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
     * sameFirstLast({1, 2, 3}) -> false
     * sameFirstLast({1, 2, 3, 1}) -> true
     * sameFirstLast({1, 2, 1}) -> true
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
     * makePi() -> {3, 1, 4}
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
     * commonEnd({1, 2, 3}, {7, 3}) -> true
     * commonEnd({1, 2, 3}, {7, 3, 2}) -> false
     * commonEnd({1, 2, 3}, {1, 3}) -> true
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
     * sum3({1, 2, 3}) -> 6
     * sum3({5, 11, 2}) -> 18
     * sum3({7, 0, 0}) -> 7
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
     * rotateLeft3({1, 2, 3}) -> {2, 3, 1}
     * rotateLeft3({5, 11, 9}) -> {11, 9, 5}
     * rotateLeft3({7, 0, 0}) -> {0, 0, 7}
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
     * reverse3({1, 2, 3}) -> {3, 2, 1}
     * reverse3({5, 11, 9}) -> {9, 11, 5}
     * reverse3({7, 0, 0}) -> {0, 0, 7}
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

    /**
     * Max End 3
     *
     * Given an array of ints length 3, figure out which is larger between the first and last elements in the array,
     * and set all the other elements to be that value. Return the changed array.
     *
     * maxEnd3({1, 2, 3}) -> {3, 3, 3}
     * maxEnd3({11, 5, 9}) -> {11, 11, 11}
     * maxEnd3({2, 11, 3}) -> {3, 3, 3}
     *
     * @param nums int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p146256
     */
    public int[] maxEnd3(int[] nums) {

        int lengthArray = nums.length;

        int max = (nums[0] > nums[lengthArray - 1]) ? nums[0] : nums[lengthArray - 1];

        for (int i = 0; i < lengthArray; i++) {
            nums[i] = max;
        }

        return nums;
    }

    /**
     * Sum 2
     *
     * Given an array of ints, return the sum of the first 2 elements in the array.
     * If the array length is less than 2, just sum up the elements that exist,
     * returning 0 if the array is length 0.
     *
     * sum2({1, 2, 3}) -> 3
     * sum2({1, 1}) -> 2
     * sum2({1, 1, 1, 1}) -> 2
     *
     * @param nums int[]
     *
     * @return int
     *
     * @link http://codingbat.com/prob/p190968
     */
    public int sum2(int[] nums) {

        int sum = 0;

        if (nums.length <= 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < 2; i++) {
            sum += nums[i];
        }

        return sum;
    }

    /**
     * Middle Way
     *
     * Given 2 int arrays, a and b, each length 3,
     * return a new array length 2 containing their middle elements.
     *
     * middleWay({1, 2, 3}, {4, 5, 6}) -> {2, 5}
     * middleWay({7, 7, 7}, {3, 8, 0}) -> {7, 8}
     * middleWay({5, 2, 9}, {1, 4, 5}) -> {2, 4}
     *
     * @param a int[]
     * @param b int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p146449
     */
    public int[] middleWay(int[] a, int[] b) {

        return new int[]{a[1], b[1]};
    }

    /**
     * Make Ends
     *
     * Given an array of ints, return a new array length 2 containing the first and last elements from the original
     * array. The original array will be length 1 or more.
     *
     * makeEnds({1, 2, 3}) -> {1, 3}
     * makeEnds({1, 2, 3, 4}) -> {1, 4}
     * makeEnds({7, 4, 6, 2}) -> {7, 2}
     *
     * @param nums int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p101230
     */
    public int[] makeEnds(int[] nums) {

        return new int[]{nums[0], nums[nums.length - 1]};
    }

    /**
     * Has 23
     *
     * Given an int array length 2, return true if it contains a 2 or a 3.
     *
     * has23({2, 5}) -> true
     * has23({4, 3}) -> true
     * has23({4, 5}) -> false
     *
     * @param nums int[]
     *
     * @return boolean
     *
     * @link http://codingbat.com/prob/p171022
     */
    public boolean has23(int[] nums) {

        for (int num : nums) {

            if (num == 2 || num == 3) {
                return true;
            }

        }

        return false;
    }

    /**
     * No 23
     *
     * Given an int array length 2, return true if it does not contain a 2 or 3.
     *
     * no23({4, 5}) -> true
     * no23({4, 2}) -> false
     * no23({3, 5}) -> false
     *
     * @param nums int[]
     *
     * @return boolean
     *
     * @link http://codingbat.com/prob/p175689
     */
    public boolean no23(int[] nums) {

        for (int num : nums) {

            if (num == 2 || num == 3) {
                return false;
            }

        }

        return true;
    }

    /**
     * Make Last
     *
     * Given an int array, return a new array with double the length where its last element is the same as the original
     * array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new
     * int array contains all 0's.
     *
     * makeLast({4, 5, 6}) -> {0, 0, 0, 0, 0, 6}
     * makeLast({1, 2}) -> {0, 0, 0, 2}
     * makeLast({3}) -> {0, 3}
     *
     * @param nums int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p137188
     */
    public int[] makeLast(int[] nums) {

        int[] result = new int[nums.length * 2];

        result[result.length - 1] = nums[nums.length - 1];

        return result;
    }

    /**
     * Double 23
     *
     * Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
     *
     * double23({2, 2}) -> true
     * double23({3, 3}) -> true
     * double23({2, 3}) -> false
     *
     * @param nums int[]
     *
     * @return boolean
     *
     * @link http://codingbat.com/prob/p145365
     */
    public boolean double23(int[] nums) {

        int countTwo = 0, countThree = 0;

        for (int num : nums) {
            if (num == 2) {
                countTwo++;
            }

            if (num == 3) {
                countThree++;
            }
        }

        return (countThree == 2 || countTwo == 2);
    }

    /**
     * Fix 23
     *
     * Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
     * Return the changed array.
     *
     * fix23({1, 2, 3}) -> {1, 2, 0}
     * fix23({2, 3, 5}) -> {2, 0, 5}
     * fix23({1, 2, 1}) -> {1, 2, 1}
     *
     * @param nums int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p120347
     */
    public int[] fix23(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }

        return nums;
    }

    /**
     * Start 1
     *
     * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
     *
     * start1({1, 2, 3}, {1, 3}) -> 2
     * start1({7, 2, 3}, {1}) -> 1
     * start1({1, 2}, {}) -> 1
     *
     * @param a int[]
     * @param b int[]
     *
     * @return int
     *
     * @link http://codingbat.com/prob/p109660
     */
    public int start1(int[] a, int[] b) {

        int count = 0;

        if (a.length > 0 && a[0] == 1) {
            count++;
        }

        if (b.length > 0 && b[0] == 1) {
            count++;
        }

        return count;
    }

    /**
     * Bigger Two
     *
     * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array
     * which has the largest sum. In event of a tie, return a.
     *
     * biggerTwo({1, 2}, {3, 4}) -> {3, 4}
     * biggerTwo({3, 4}, {1, 2}) -> {3, 4}
     * biggerTwo({1, 1}, {1, 2}) -> {1, 2}
     *
     * @param a int[]
     * @param b int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p109537
     */
    public int[] biggerTwo(int[] a, int[] b) {

        return (a[0] + a[1] < b[0] + b[1]) ? b : a;
    }

    /**
     * Make Middle
     *
     * Given an array of ints of even length, return a new array length 2 containing the middle two elements from the
     * original array. The original array will be length 2 or more.
     *
     * makeMiddle({1, 2, 3, 4}) -> {2, 3}
     * makeMiddle({7, 1, 2, 3, 4, 9}) -> {2, 3}
     * makeMiddle({1, 2}) -> {1, 2}
     *
     * @param nums int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p199519
     */
    public int[] makeMiddle(int[] nums) {

        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }

    /**
     * Plus Two
     *
     * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
     *
     * plusTwo({1, 2}, {3, 4}) -> {1, 2, 3, 4}
     * plusTwo({4, 4}, {2, 2}) -> {4, 4, 2, 2}
     * plusTwo({9, 2}, {3, 4}) -> {9, 2, 3, 4}
     *
     * @param a int[]
     * @param b int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p180840
     */
    public int[] plusTwo(int[] a, int[] b) {

        int[] result = Arrays.copyOf(a, a.length + b.length);

        System.arraycopy(b, 0, result, a.length, b.length);

        return result;
    }

    /**
     * Swap Ends
     *
     * Given an array of ints, swap the first and last elements in the array. Return the modified array. The array
     * length will be at least 1.
     *
     * swapEnds({1, 2, 3, 4}) -> {4, 2, 3, 1}
     * swapEnds({1, 2, 3}) -> {3, 2, 1}
     * swapEnds({8, 6, 7, 9, 5}) -> {5, 6, 7, 9, 8}
     *
     * @param nums int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p118044
     */
    public int[] swapEnds(int[] nums) {

        int swap = nums[0];

        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = swap;

        return nums;
    }

    /**
     * Mid Three
     *
     * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the
     * array. The array length will be at least 3.
     *
     * midThree({1, 2, 3, 4, 5}) -> {2, 3, 4}
     * midThree({8, 6, 7, 5, 3, 0, 9}) -> {7, 5, 3}
     * midThree({1, 2, 3}) -> {1, 2, 3}
     *
     * @param nums int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p155713
     */
    public int[] midThree(int[] nums) {

        int middle = nums.length / 2;

        return new int[]{nums[middle - 1], nums[middle], nums[middle + 1]};
    }

    /**
     * Max Triple
     *
     * Given an array of ints of odd length, look at the first, last, and middle values in the array and return the
     * largest. The array length will be a least 1.
     *
     * maxTriple({1, 2, 3}) -> 3
     * maxTriple({1, 5, 3}) -> 5
     * maxTriple({5, 2, 3}) -> 5
     *
     * @param nums int[]
     *
     * @return int
     *
     * @link http://codingbat.com/prob/p185176
     */
    public int maxTriple(int[] nums) {

        int max = 0;

        if (nums.length < 3) {
            return max;
        }

        int[] triple = new int[]{nums[0], nums[nums.length / 2], nums[nums.length - 1]};

        for (int num : triple) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    /**
     * Front Piece
     *
     * Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than
     * length 2, use whatever elements are present.
     *
     * frontPiece({1, 2, 3}) -> {1, 2}
     * frontPiece({1, 2}) -> {1, 2}
     * frontPiece({1}) -> {1}
     *
     * @param nums int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p142455
     */
    public int[] frontPiece(int[] nums) {

        if (nums.length <= 1) {
            return nums;
        }

        return Arrays.copyOfRange(nums, 0, 2);
    }

    /**
     * Unlucky 1
     *
     * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
     * Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
     *
     * unlucky1({1, 3, 4, 5}) -> true
     * unlucky1({2, 1, 3, 4, 5}) -> true
     * unlucky1({1, 1, 1}) -> false
     *
     * @param nums int[]
     *
     * @return boolean
     *
     * @link http://codingbat.com/prob/p197308
     */
    public boolean unlucky1(int[] nums) {

        if (nums.length <= 1) {
            return false;
        }

        for (int i = 0, j = nums.length; i < 2; i++, j--) {
            if (nums[i] == 1 && nums[i + 1] == 3) {
                return true;
            }
        }

        return (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
    }

    /**
     * Make 2
     *
     * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a
     * followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements
     * available between the 2 arrays.
     *
     * make2({4, 5}, {1, 2, 3}) -> {4, 5}
     * make2({4}, {1, 2, 3}) -> {4, 1}
     * make2({}, {1, 2}) -> {1, 2}
     *
     * @param a int[]
     * @param b int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p143461
     */
    public int[] make2(int[] a, int[] b) {

        int[] res = new int[2];

        if (a.length == 0) {
            res[0] = b[0];
            res[1] = b[1];
        } else if (a.length == 1) {
            res[0] = a[0];
            res[1] = b[0];
        } else
        {
            res[0] = a[0];
            res[1] = a[1];
        }
        return res;
    }

    /**
     * Front 11
     *
     * Given 2 int arrays, a and b, of any length,
     * return a new array with the first element of each array.
     * If either array is length 0, ignore that array.
     *
     * front11({1, 2, 3}, {7, 9, 8}) -> {1, 7}
     * front11({1}, {2}) -> {1, 2}
     * front11({1, 7}, {}) -> {1}
     *
     * @param a int[]
     * @param b int[]
     *
     * @return int[]
     *
     * @link http://codingbat.com/prob/p128270
     */
    public int[] front11(int[] a, int[] b) {

        int[] one = new int[1];
        int[] two = new int[2];

        if (a.length == 0 && b.length == 0) {
            return a;
        }

        if (a.length >= 1 && b.length == 0) {
            one[0] = a[0];
            return one;
        }

        if (a.length >= 1 && b.length >= 1) {
            two[0] = a[0];
            two[1] = b[0];
            return two;
        }

        if (a.length == 0 && b.length >= 1) {
            one[0] = b[0];
            return one;
        }

        return a;
    }

}