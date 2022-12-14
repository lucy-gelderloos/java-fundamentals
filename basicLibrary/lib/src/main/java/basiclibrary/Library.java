package basiclibrary;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Library {
    public boolean someLibraryMethod() {return true;}

    public static int[] roll(int n) {
        int[] rolls = new int[n];
        for(int i = 0; i < n; i++){
            Random random = new Random();
            int thisRoll = (random.nextInt(6)) + 1;
            rolls[i] = thisRoll;
        }
        return rolls;
    }

    public static boolean containsDuplicates(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static float findAverage(int[] array) {
        float total = 0.0f;
        for(int i = 0; i < array.length; i++){
            total = total + array[i];
        }
        return total/array.length;
    }

    public static int[] findLowestAverage(int[][] matrix) {
        float lowestAverage = findAverage(matrix[0]);
        int lowestAverageIndex = 0;
        for (int i = 1; i < matrix.length; i++) {
            float thisAverage = findAverage(matrix[i]);
            if (thisAverage <= lowestAverage) {
                lowestAverage = thisAverage;
                lowestAverageIndex = i;
            }
        }
        return matrix[lowestAverageIndex];
    }

    public static String analyzeTemps(int[][] monthTemps){

        HashSet<Integer> uniqueTemps = new HashSet<>();
        // put all unique temps into a HashSet
        for(int i = 0; i < monthTemps.length; i++){
            for(int j = 0; j < monthTemps[i].length; j++){
                uniqueTemps.add(monthTemps[i][j]);
            }
        }

        int minTemp = monthTemps[0][0];
        int maxTemp = monthTemps[0][0];
        // find the minimum and maximum temperature out of all values
        for (int temp : uniqueTemps) {
            if(temp < minTemp) {
                minTemp = temp;
            } else if (temp > maxTemp) {
                maxTemp = temp;
            }
        }

        String highTempString = "High: " + maxTemp;
        String lowTempString = "Low: " + minTemp;

        int tempRange = maxTemp - minTemp;
        int[] allTemps = new int[tempRange];
        // create an array containing each degree in the temperature range between the monthly high and low temps
        for(int i = 0; i < tempRange; i++) {
            int j = minTemp + i;
            allTemps[i] = j;
        }

        String[] missingTempsArr = new String[tempRange - uniqueTemps.size() + 1];
        // iterate through the array of all temps and return a string containing each temperature that does not appear in the list of unique temps
        int j = 0;
        for(int i = 0; i < allTemps.length; i++) {
            if(!uniqueTemps.contains(allTemps[i])) {
                missingTempsArr[j] = "Never saw temperature: " + allTemps[i];
                j = j + 1;
            }
        }

        String missingTempsString = "";
        // concatenate each missing temp string to the return string, with line breaks preceding every line after the first
        for(int i = 0; i < missingTempsArr.length; i++) {
            if(i > 0){
                missingTempsString = missingTempsString + "\n";
            }
            missingTempsString = missingTempsString + missingTempsArr[i];
        }
        // concatenate everything together, with line breaks between each section
        return highTempString + "\n" + lowTempString + "\n" + missingTempsString;
        // https://www.baeldung.com/java-string-newline
    }

    public static String tally(ArrayList<String> votes){

        HashSet<String> categories = new HashSet<>();
        // create a list containing each category voted for
        for(String vote : votes) {
            categories.add(vote);
        }

        HashMap<String, Integer> voteTally = new HashMap<>();
        // create a hashmap with each category as a key corresponding to a number of votes. Vote count starts at 0.
        for(String category : categories) {
            voteTally.put(category,0);
        }
        // iterate through the votes. For each vote, get that key from the hashmap and add 1 to the vote count.
        for(String vote : votes) {
            int voteCount = voteTally.get(vote);
            voteTally.put(vote,voteCount + 1);
        }

        int mostVotes = 0;
        String winner = "";
        // find which key has the most votes
        for(String category : categories) {
            if(voteTally.get(category) > mostVotes) {
                mostVotes = voteTally.get(category);
                winner = category;
            }
        }

        return winner + " received the most votes!";
    }
}


