package basiclibrary;

import java.util.Random;
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
}


