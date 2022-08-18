package basiclibrary;

import java.util.Random;
//import java.util.ArrayList;
//import java.util.HashMap;
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

        for(int i = 0; i < monthTemps.length; i++){
            for(int j = 0; j < monthTemps[i].length; j++){
                uniqueTemps.add(monthTemps[i][j]);
            }
        }

        int minTemp = monthTemps[0][0];
        int maxTemp = monthTemps[0][0];

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

        for(int i = 0; i < tempRange; i++) {
            int j = minTemp + i;
            allTemps[i] = j;
        }

        String[] missingTempsArr = new String[tempRange - uniqueTemps.size()];

        int j = 0;
        for(int i = 0; i < allTemps.length; i++) {
            if(!uniqueTemps.contains(allTemps[i])) {
                missingTempsArr[j] = "Never saw temperature: " + allTemps[i];
                j = j + 1;
            }
        }

        String missingTempsString = "";

        for(int i = 0; i < missingTempsArr.length; i++) {
            if(i > 0){
                missingTempsString = missingTempsString + "\n";
            }
            missingTempsString = missingTempsString + missingTempsArr[i];
        }

        return highTempString + "\n" + lowTempString + "\n" + missingTempsString;
    }
}


