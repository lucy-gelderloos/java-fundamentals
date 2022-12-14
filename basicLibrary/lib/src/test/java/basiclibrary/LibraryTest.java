/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void testDiceRoller() {
        int numRolls = 10;
        int[] testRolls = Library.roll(numRolls);

        assertEquals(numRolls, testRolls.length, "roll should return an array of the same length as the number provided");
        assertTrue(findMax(testRolls) <= 6, "no value in the array should be greater than 6");
    }
    public static int findMax(int[] array) {
        int max = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @Test void testContainsDuplicates() {
        int[] testArrayTrue = new int[]{1,2,2,3,4,5,6,6};
        int[] testArrayFalse = new int[]{1,2,3,4,5,6,7,8};

        assertTrue(Library.containsDuplicates(testArrayTrue),"containsDuplicates should return 'true' if an array with duplicate values is passed in");
        assertFalse(Library.containsDuplicates(testArrayFalse),"containsDuplicates should return 'false' if an array with no duplicate values is passed in");
    }

    @Test void testFindAverage() {
        int[] testArrayTen = new int[]{0,5,10,15,20};
        int[] testArraySevenFive = new int[]{6,7,8,9};

        assertEquals(10,Library.findAverage(testArrayTen),"findAverage should return 10 as the average of testArrayTen");
        assertEquals(7.5, Library.findAverage(testArraySevenFive),"findAverage should return 7.5 as the average of testArraySevenFive");
    }

    @Test void testFindLowestAverage() {
        int[][] testMatrix = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals(testMatrix[2],Library.findLowestAverage(testMatrix),"findLowestAverage should return the array at index 2 of the test matrix");
    }

    @Test void testAnalyzeTemps() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String expectedString = "High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69";

        assertEquals(expectedString,Library.analyzeTemps(weeklyMonthTemperatures));
    }

    @Test void testTally() {
        ArrayList<String> votesTest1 = new ArrayList<>();
        votesTest1.add("Bush");
        votesTest1.add("Bush");
        votesTest1.add("Bush");
        votesTest1.add("Shrub");
        votesTest1.add("Hedge");
        votesTest1.add("Shrub");
        votesTest1.add("Bush");
        votesTest1.add("Hedge");
        votesTest1.add("Bush");

        ArrayList<String> votesTest2 = new ArrayList<>();
        votesTest2.add("oatmeal raisin");
        votesTest2.add("chocolate chip");
        votesTest2.add("snickerdoodle");
        votesTest2.add("chocolate chip");
        votesTest2.add("chocolate chip");
        votesTest2.add("snickerdoodle");
        votesTest2.add("chocolate chip");
        votesTest2.add("oatmeal raisin");
        votesTest2.add("chocolate chip");
        votesTest2.add("snickerdoodle");

        assertEquals("Bush received the most votes!",Library.tally(votesTest1));
        assertEquals("chocolate chip received the most votes!",Library.tally(votesTest2));
    }

}
