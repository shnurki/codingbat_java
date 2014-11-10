package com.codingbat.java.main;

/**
 * String1
 *
 * Basic string problems -- no loops. Use + to combine Strings,
 * str.length() is the number of chars in a String,
 * str.substring(i, j) extracts the substring starting at index i
 * and running up to but not including index j.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/String-1
 */
public class String1 {

    /**
     * Hello Name
     *
     * Given a string name, e.g. "Bob",
     * return a greeting of the form "Hello Bob!".
     *
     * helloName("Bob") -> "Hello Bob!"
     * helloName("Alice") -> "Hello Alice!"
     * helloName("X") -> "Hello X!"
     *
     * @param name String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p171896
     */
    public String helloName(String name) {
        return String.format("Hello %s!", name);
    }


    /**
     * Make Abba
     *
     * Given two strings, a and b,
     * return the result of putting them together in the order abba,
     * e.g. "Hi" and "Bye" returns "HiByeByeHi".
     *
     * makeAbba("Hi", "Bye") -> "HiByeByeHi"
     * makeAbba("Yo", "Alice") -> "YoAliceAliceYo"
     * makeAbba("What", "Up") -> "WhatUpUpWhat"
     *
     * @param a String
     * @param b String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p161056
     */
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    /**
     * Make Tags
     *
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
     * In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
     * Given tag and word strings, create the HTML string with tags
     * around the word, e.g. "<i>Yay</i>".
     *
     * makeTags("i", "Yay") -> "<i>Yay</i>"
     * makeTags("i", "Hello") -> "<i>Hello</i>"
     * makeTags("cite", "Yay") -> "<cite>Yay</cite>"
     *
     * @param tag  String
     * @param word String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p147483
     */
    public String makeTags(String tag, String word) {
        return String.format("<%s>%s</%s>", tag, word, tag);
    }

    /**
     * Make Out Word
     *
     * Given an "out" string length 4, such as "<<>>", and a word,
     * return a new string where the word is in the middle
     * of the out string, e.g. "<<word>>".
     * Note: use str.substring(i, j) to extract the String starting at index i and
     * going up to but not including index j.
     *
     * makeOutWord("<<>>", "Yay") -> "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") -> "<<WooHoo>>"
     * makeOutWord("[[]]", "word") -> "[[word]]"
     *
     * @param out  String
     * @param word String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p184030
     */
    public String makeOutWord(String out, String word) {

        return String.format("%s%s%s", out.substring(0, 2), word, out.substring(2, 4));
    }

    /**
     * Extra End
     *
     * Given a string,
     * return a new string made of 3 copies of the last 2 chars of the original string.
     * The string length will be at least 2.
     *
     * extraEnd("Hello") -> "lololo"
     * extraEnd("ab") -> "ababab"
     * extraEnd("Hi") -> "HiHiHi"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p108853
     */
    public String extraEnd(String str) {
        String last = str.substring(str.length() - 2);

        return last + last + last;
    }

    /**
     * First Two
     *
     * Given a string,
     * return the string made of its first two chars,
     * so the String "Hello" yields "He".
     * If the string is shorter than length 2,
     * return whatever there is, so "X" yields "X",
     * and the empty string "" yields the empty string "".
     * Note that str.length() returns the length of a string.
     *
     * firstTwo("Hello") -> "He"
     * firstTwo("abcdefg") -> "ab"
     * firstTwo("ab") -> "ab"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p163411
     */
    public String firstTwo(String str) {
        return (str.length() > 2) ? str.substring(0, 2) : str;
    }

    /**
     * First Half
     *
     * Given a string of even length, return the first half.
     * So the string "WooHoo" yields "Woo".
     *
     * firstHalf("WooHoo") -> "Woo"
     * firstHalf("HelloThere") -> "Hello"
     * firstHalf("abcdef") -> "abc"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p172267
     */
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    /**
     * Without End
     *
     * Given a string,
     * return a version without the first and last char, so "Hello" yields "ell".
     * The string length will be at least 2.
     *
     * withoutEnd("Hello") -> "ell"
     * withoutEnd("java") -> "av"
     * withoutEnd("coding") -> "odin"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p130896
     */
    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * Combo String
     *
     * Given 2 strings, a and b, return a string of the form short+long+short,
     * with the shorter string on the outside and the longer string on the inside.
     * The strings will not be the same length, but they may be empty (length 0).
     *
     * comboString("Hello", "hi") -> "hiHellohi"
     * comboString("hi", "Hello") -> "hiHellohi"
     * comboString("aaa", "b") -> "baaab"
     *
     * @param a String
     * @param b String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p168564
     */
    public String comboString(String a, String b) {
        if (a.length() > b.length())
            return b + a + b;
        else
            return a + b + a;
    }

    /**
     * Non Start
     *
     * Given 2 strings,
     * return their concatenation, except omit the first char of each.
     * The strings will be at least length 1.
     *
     * nonStart("Hello", "There") -> "ellohere"
     * nonStart("java", "code") -> "avaode"
     * nonStart("shotl", "java") -> "hotlava"
     *
     * @param a String
     * @param b String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p143825
     */
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    /**
     * Left 2
     *
     * Given a string,
     * return a "rotated left 2" version where the first 2 chars are moved to the end.
     * The string length will be at least 2.
     *
     * left2("Hello") -> "lloHe"
     * left2("java") -> "vaja"
     * left2("Hi") -> "Hi"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p197720
     */
    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    /**
     * Right 2
     *
     * Given a string,
     * return a "rotated right 2" version where the last 2 chars are moved to the start.
     * The string length will be at least 2.
     *
     * right2("Hello") -> "loHel"
     * right2("java") -> "vaja"
     * right2("Hi") -> "Hi"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p130781
     */
    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    /**
     * The End
     *
     * Given a string,
     * return a string length 1 from its front,
     * unless front is false, in which case return a string
     * length 1 from its back. The string will be non-empty.
     *
     * theEnd("Hello", true) -> "H"
     * theEnd("Hello", false) -> "o"
     * theEnd("oh", true) -> "o"
     *
     * @param str   String
     * @param front boolean
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p162477
     */
    public String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

    /**
     * Without End 2
     *
     * Given a string,
     * return a version without both the first and last char of the string.
     * The string may be any length, including 0.
     *
     * withouEnd2("Hello") -> "ell"
     * withouEnd2("abc") -> "b"
     * withouEnd2("ab") -> ""
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p174254
     */
    public String withoutEnd2(String str) {
        return (str.length() > 2) ? str.substring(1, str.length() - 1) : "";
    }

    /**
     * Middle Two
     *
     * Given a string of even length,
     * return a string made of the middle two chars,
     * so the string "string" yields "ri".
     * The string length will be at least 2.
     *
     * middleTwo("string") -> "ri"
     * middleTwo("code") -> "od"
     * middleTwo("Practice") -> "ct"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p137729
     */
    public String middleTwo(String str) {
        int num = str.length() / 2;

        return str.substring(num - 1, num + 1);
    }

    /**
     * Ends Ly
     *
     * Given a string, return true if it ends in "ly".
     *
     * endsLy("oddly") -> true
     * endsLy("y") -> false
     * endsLy("oddy") -> false
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p103895
     */
    public boolean endsLy(String str) {
        return str.length() >= 2 && str.substring(str.length() - 2).equals("ly");
    }

    /**
     * nTwice
     *
     * Given a string and an int n,
     * return a string made of the first and last n chars from the string.
     * The string length will be at least n.
     *
     * nTwice("Hello", 2) -> "Helo"
     * nTwice("Chocolate", 3) -> "Choate"
     * nTwice("Chocolate", 1) -> "Ce"
     *
     * @param str String
     * @param n   int
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p174148
     */
    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    /**
     * Two Char
     *
     * Given a string and an index,
     * return a string length 2 starting at the given index.
     * If the index is too big or too small to define a string length 2,
     * use the first 2 chars. The string length will be at least 2.
     *
     * twoChar("java", 0) -> "ja"
     * twoChar("java", 2) -> "va"
     * twoChar("java", 3) -> "ja"
     *
     * @param str   String
     * @param index int
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p144623
     */
    public String twoChar(String str, int index) {
        if (0 > index) {
            return str.substring(0, 2);
        }

        if ((index + 2) <= str.length() && (index + 2) > 0)
            return str.substring(index, index + 2);
        else
            return str.substring(0, 2);
    }

    /**
     * Middle Three
     *
     * Given a string of odd length,
     * return the string length 3 from its middle, so "Candy" yields "and".
     * The string length will be at least 3.
     *
     * middleThree("Candy") -> "and"
     * middleThree("and") -> "and"
     * middleThree("solving") -> "lvi"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p115863
     */
    public String middleThree(String str) {
        if (str.length() <= 3)
            return str;
        else
            return str.substring((str.length() / 2 - 1), (str.length() / 2 + 2));
    }

    /**
     * Has Bad
     *
     * Given a string,
     * return true if "bad" appears starting at index 0 or 1 in the string,
     * such as with "badxxx" or "xbadxx" but not "xxbadxx".
     * The string may be any length, including 0.
     * Note: use .equals() to compare 2 strings.
     *
     * hasBad("badxx") -> true
     * hasBad("xbadxx") -> true
     * hasBad("xxbadxx") -> false
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p139075
     */
    public boolean hasBad(String str) {

        if (str.length() < 3)
            return false;

        if (str.length() == 3 && str.equals("bad")) {
            return true;
        }

        if (str.length() > 3) {
            if (str.substring(1, 4).equals("bad") || str.substring(0, 3).equals("bad")) {
                return true;
            }
        }
        return false;
    }

    /**
     * At First
     *
     * Given a string,
     * return a string length 2 made of its first 2 chars.
     * If the string length is less than 2, use '@' for the missing chars.
     *
     * atFirst("hello") -> "he"
     * atFirst("hi") -> "hi"
     * atFirst("h") -> "h@"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p139076
     */
    public String atFirst(String str) {
        if (str.length() == 1) {
            return str + "@";
        } else if (str.length() == 0) {
            return "@@";
        } else
        {
            return str.substring(0, 2);
        }
    }

    /**
     * Last Chars
     *
     * Given 2 strings,
     * a and b, return a new string made of the first char of a and the last char of b,
     * so "yo" and "java" yields "ya".
     * If either string is length 0, use '@' for its missing char.
     *
     * lastChars("last", "chars") -> "ls"
     * lastChars("yo", "java") -> "ya"
     * lastChars("hi", "") -> "h@"
     *
     * @param a String
     * @param b String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p138183
     */
    public String lastChars(String a, String b) {
        a = (a.isEmpty()) ? "@" : a.substring(0, 1);
        b = (b.isEmpty()) ? "@" : b.substring(b.length() - 1);

        return a + b;
    }

    /**
     * Con Cat
     *
     * Given two strings,
     * append them together (known as "concatenation") and return the result.
     * However, if the concatenation creates a double-char,
     * then omit one of the chars, so "abc" and "cat" yields "abcat".
     *
     * conCat("abc", "cat") -> "abcat"
     * conCat("dog", "cat") -> "dogcat"
     * conCat("abc", "") -> "abc"
     *
     * @param a String
     * @param b String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p132118
     */
    public String conCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty())
            return a + b;

        if (a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1))) {
            return a.substring(0, a.length() - 1) + b;
        } else
        {

            return a + b;
        }
    }

    /**
     * Last Two
     *
     * Given a string of any length,
     * return a new string where the last 2 chars,
     * if present, are swapped, so "coding" yields "codign".
     *
     * lastTwo("coding") -> "codign"
     * lastTwo("cat") -> "cta"
     * lastTwo("ab") -> "ba"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p194786
     */
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }

        return str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() - 1);
    }

    /**
     * See Color
     *
     * Given a string,
     * if the string begins with "red" or "blue" return that color string,
     * otherwise return the empty string.
     *
     * seeColor("redxx") -> "red"
     * seeColor("xxred") -> ""
     * seeColor("blueTimes") -> "blue"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p199216
     */
    public String seeColor(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
            return "red";
        } else if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
            return "blue";
        } else
        {
            return "";
        }
    }

    /**
     * Front Again
     *
     * Given a string,
     * return true if the first 2 chars in the string also appear at the end of the string,
     * such as with "edited".
     *
     * frontAgain("edited") -> true
     * frontAgain("edit") -> false
     * frontAgain("ed") -> true
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p196652
     */
    public boolean frontAgain(String str) {
        return (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2)));
    }

    /**
     * Min Cat
     *
     * Given two strings, append them together (known as "concatenation") and return the result.
     * However, if the strings are different lengths,
     * omit chars from the longer string so it is the same length as the shorter string.
     * So "Hello" and "Hi" yield "loHi". The strings may be any length.
     *
     * minCat("Hello", "Hi") -> "loHi"
     * minCat("Hello", "java") -> "ellojava"
     * minCat("java", "Hello") -> "javaello"
     *
     * @param a String
     * @param b String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p105745
     */
    public String minCat(String a, String b) {
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length(), a.length()) + b;
        } else if (a.length() < b.length()) {
            return a + b.substring(b.length() - a.length(), b.length());
        } else
        {
            return a + b;
        }
    }

    /**
     * Extra Front
     *
     * Given a string,
     * return a new string made of 3 copies of the first 2 chars of the original string.
     * The string may be any length.
     * If there are fewer than 2 chars, use whatever is there.
     *
     * extraFront("Hello") -> "HeHeHe"
     * extraFront("ab") -> "ababab"
     * extraFront("H") -> "HHH"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p172063
     */
    public String extraFront(String str) {
        if (str.isEmpty()) {
            return "";
        } else if (str.length() == 1) {
            return str + str + str;
        } else if (str.length() > 1) {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }

        return "";
    }

    /**
     * Without 2
     *
     * Given a string, if a length 2 substring appears at both its beginning and end,
     * return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
     * The substring may overlap with itself, so "Hi" yields "". Otherwise,
     * return the original string unchanged.
     *
     * without2("HelloHe") -> "lloHe"
     * without2("HelloHi") -> "HelloHi"
     * without2("Hi") -> ""
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p142247
     */
    public String without2(String str) {
        if (str.isEmpty()) {
            return "";
        } else if (str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
            return str.substring(2, str.length());
        } else
        {
            return str;
        }
    }

    /**
     * De Front
     *
     * Given a string, return a version without the first 2 chars.
     * Except keep the first char if it is 'a' and keep the second char if it is 'b'.
     * The string may be any length. Harder than it looks.
     *
     * deFront("Hello") -> "llo"
     * deFront("java") -> "va"
     * deFront("away") -> "aay"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p110141
     */
    public String deFront(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            switch (i) {
                case 0:
                    if (c == 'a') {
                        result.append(c);
                    }
                    break;
                case 1:
                    if (c == 'b') {
                        result.append(c);
                    }
                    break;
                default:
                    result.append(c);
            }
        }
        return result.toString();
    }

    /**
     * Start Word
     *
     * Given a string and a second "word" string,
     * we'll say that the word matches the string if it appears at the front of the string,
     * except its first char does not need to match exactly.
     * On a match, return the front of the string, or otherwise return the empty string.
     * So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns
     * "hip". The word will be at least length 1.
     *
     * startWord("hippo", "hi") -> "hi"
     * startWord("hippo", "xip") -> "hip"
     * startWord("hippo", "i") -> "h"
     *
     * @param str  String
     * @param word String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p141494
     */
    public String startWord(String str, String word) {
        if (str.length() < 1) {
            return "";
        }
        if (str.substring(1).indexOf(word.substring(1)) != 0) {
            return "";
        }
        return str.substring(0, word.length());
    }

    /**
     * Without X
     *
     * Given a string, if the first or last chars are 'x',
     * return the string without those 'x' chars, and otherwise
     * return the string unchanged.
     *
     * withoutX("xHix") -> "Hi"
     * withoutX("xHi") -> "Hi"
     * withoutX("Hxix") -> "Hxi"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p151940
     */
    public String withoutX(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.length() > 1) {
            if (str.substring(0, 1).equals("x") && str.substring(str.length() - 1, str.length()).equals("x")) {
                return str.substring(1, str.length() - 1);
            } else if (str.substring(0, 1).equals("x")) {
                return str.substring(1, str.length());
            } else if (str.substring(str.length() - 1, str.length()).equals("x")) {
                return str.substring(0, str.length() - 1);
            } else
            {
                return str;
            }
        } else
        {
            if (str.substring(0, 1).equals("x")) {
                return "";
            } else
            {
                return str;
            }
        }
    }

    /**
     * Without X2
     *
     * Given a string, if one or both of the first 2 chars is 'x',
     * return the string without those 'x' chars, and
     * otherwise return the string unchanged.
     * This is a little harder than it looks.
     *
     * withoutX2("xHi") -> "Hi"
     * withoutX2("Hxi") -> "Hi"
     * withoutX2("Hi") -> "Hi"
     *
     * @param str String
     *
     * @return String
     *
     * @link http://codingbat.com/prob/p151359
     */
    public String withoutX2(String str) {
        if (str.isEmpty()) {
            return "";
        } else if (str.length() > 1) {
            if (str.substring(0, 1).equals("x") && str.substring(1, 2).equals("x")) {
                return str.substring(2);
            } else if (str.substring(0, 1).equals("x")) {
                return str.substring(1);
            } else if (str.substring(1, 2).equals("x")) {
                return str.substring(0, 1) + str.substring(2);
            } else
            {
                return str;
            }

        } else
        {
            if (str.substring(0, 1).equals("x")) {
                return "";
            } else
            {
                return str;
            }
        }
    }
}
