package com.codingbat.java.main;

/**
 * Logic1
 *
 * Basic boolean logic puzzles -- if else && || !.
 *
 * @author avcherkasov <shnurok14@yandex.ru>
 * @link http://codingbat.com/java/Logic-1
 */
public class Logic1 {

    /**
     * Cigar Party
     *
     * When squirrels get together for a party, they like to have cigars.
     * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
     * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
     * Return true if the party with the given values is successful, or false otherwise.
     *
     * cigarParty(30, false) → false
     * cigarParty(50, false) → true
     * cigarParty(70, true) → true
     *
     * @param cigars    int
     * @param isWeekend boolean
     *
     * @return boolean
     *
     * @link http://codingbat.com/prob/p159531
     */
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (!isWeekend && (cigars >= 40 && cigars <= 60) || (isWeekend && cigars >= 40));
    }
}
