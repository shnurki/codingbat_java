package com.codingbat.java.test;

import com.codingbat.java.main.Logic1;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Logic1Test
 *
 * Basic boolean logic puzzles -- if else && || !.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Logic-1
 */
public class Logic1Test {

    private Logic1 logic;

    @Test
    public void testMaxSpan() {
        assertFalse("1", logic.cigarParty(30, false));
        assertTrue("2", logic.cigarParty(50, false));
        assertTrue("3", logic.cigarParty(70, true));
        assertFalse("4", logic.cigarParty(30, true));
        assertTrue("5", logic.cigarParty(50, true));
        assertTrue("6", logic.cigarParty(60, false));
        assertFalse("7", logic.cigarParty(61, false));
        assertTrue("8", logic.cigarParty(40, false));
        assertFalse("9", logic.cigarParty(39, false));
        assertTrue("10", logic.cigarParty(40, true));
        assertFalse("11", logic.cigarParty(39, true));
    }

    @Test
    public void testDateFashion() {
    }

    @Test
    public void testSquirrelPlay() {
    }

    @Test
    public void testCaughtSpeeding() {
    }

    @Test
    public void testSortaSum() {
    }

    @Test
    public void testAlarmClock() {
    }

    @Test
    public void testLove6() {
    }

    @Test
    public void testIn1To10() {
    }

    @Test
    public void testSpecialEleven() {
    }

    @Test
    public void testMore20() {
    }

    @Test
    public void testOld35() {
    }

    @Test
    public void testLess20() {
    }

    @Test
    public void testNearTen() {
    }

    @Test
    public void testTeenSum() {
    }

    @Test
    public void testAnswerCell() {
    }

    @Test
    public void testTeaParty() {
    }

    @Test
    public void testFizzString() {
    }

    @Test
    public void testFizzString2() {
    }

    @Test
    public void testTwoAsOne() {
    }

    @Test
    public void testInOrder() {
    }

    @Test
    public void testInOrderEqual() {
    }

    @Test
    public void testLastDigit() {
    }

    @Test
    public void testLessBy10() {
    }

    @Test
    public void testWithoutDoubles() {
    }

    @Test
    public void testMaxMod5() {
    }

    @Test
    public void testRedTicket() {
    }

    @Test
    public void testGreenTicket() {
    }

    @Test
    public void testBlueTicket() {
    }

    @Test
    public void testShareDigit() {
    }

    @Test
    public void testSumLimit() {
    }

    @Before
    public void setUp() {
        logic = new Logic1();
    }
}
