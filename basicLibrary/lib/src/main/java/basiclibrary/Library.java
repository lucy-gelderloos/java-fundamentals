import java.util.Random;

package basiclibrary;

public class Library {

    public static int[] roll(int n) {
        int[] rolls = int[n];
        for(int i = 0; i < n; i++){
            Random random = new Random();
            int thisRoll = (random(int 6)) + 1;
            rolls[i] = thisRoll;
        }
        return rolls;
    }

    int numRolls = 10;
    roll(numRolls);
}
