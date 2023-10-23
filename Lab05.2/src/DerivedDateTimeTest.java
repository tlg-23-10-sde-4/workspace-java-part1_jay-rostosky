/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import static java.time.DayOfWeek.*;  // MONDAY instead of DayOfWeek.MONDAY
import static java.time.temporal.TemporalAdjusters.*;

class DerivedDateTimeTest {

    /**
     * main() calls each of the test methods in turn (currently commented out).
     * To run one test method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
        // testPresidentsFirst100Days();
        // testPopularBirthdays();
        // testEarlyRetirement();
        // testLaborDay();
        // testElectionDay();
        testAnniversary();
    }

    /**
     * TASK: new American presidents are often measured by their performance
     * during the first 100 days in office.
     * Inauguration Day 2017 is Jan 20.  When is this president's 100-day deadline?
     *
     * RESULT:
     */
    public static void testPresidentsFirst100Days() {
        LocalDate inauguration = LocalDate.of(2017, 1, 20);
        LocalDate deadline = inauguration.plusDays(100);
        System.out.println(deadline);
    }

    /**
     * TASK: Certain times of the year seem to have more birthdays than other times.
     * Some believe that this is because more babies are conceived during certain times of year.
     * Below, assume a due date 38 weeks after conception, during a non-leap-year.
     *
     * RESULT:
     */
    public static void testPopularBirthdays() {
        // what is the average birthday of someone conceived on Valentine's Day?
        LocalDate vday = LocalDate.of(2023, 2, 14);
        LocalDate bday = vday.plusWeeks(38);
        System.out.println(bday);

        // TODO: what is the average birthday of someone conceived on New Year's Eve (after midnight)?
    }

    /**
     * TASK: you've saved diligently your whole life and plan to retire as soon as
     * you can take distributions from your 401(k) penalty-free, which is when you turn 59 1/2.
     * When will / did you retire?
     *
     * RESULT:
     */
    public static void testEarlyRetirement() {
        LocalDate bday = LocalDate.of(1966, 12, 5);
        LocalDate retirement = bday.plusYears(59).plusMonths(6);
        System.out.println(retirement);
        System.out.println(retirement.getDayOfWeek());
    }

    /**
     * TASK: when was Labor Day during the year you were born?
     * Note: start with a LocalDate equal to your birthday.
     * Note: Labor Day is the first Monday in Sept.
     *
     * RESULT:
     */
    public static void testLaborDay() {
        LocalDate sept1 = LocalDate.of(1966, 9, 1);
        LocalDate laborDay = sept1.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(laborDay);
        System.out.println(laborDay.getDayOfWeek());
    }

    /**
     * TASK: Election Day in the United States is defined as the Tuesday
     * immediately after the 1st Monday in November.
     * When is Election Day 2024?
     *
     * RESULT:
     */
    public static void testElectionDay() {
        // LocalDate nov2 = LocalDate.of(2024, 11, 2);
        // LocalDate election = nov2.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));

        LocalDate nov1 = LocalDate.of(2024, 11, 1);
        LocalDate election = nov1.with(nextOrSame(MONDAY)).plusDays(1);
        System.out.println(election);
    }

    /**
     * TASK: Akesh and Samanta were married on 6/6/1969.
     * They are planning their 50th wedding anniversary, and would like to throw a big party.
     * If their anniversary does not fall on a Saturday,
     * they'd like to have their party the following Saturday.
     * What is the date of the party?
     *
     * RESULT:
     */
    public static void testAnniversary() {
        LocalDate wedding = LocalDate.of(1969, 6, 6);
        LocalDate anniversary = wedding.plusYears(50);
        LocalDate party = anniversary.with(nextOrSame(SATURDAY));
        System.out.println(party);
        System.out.println(party.getDayOfWeek());
    }
}