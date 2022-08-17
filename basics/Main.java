import java.util.Random;
import java.time.LocalDateTime;

public class Main {
    public static void main (String[] args){

        int dogCount = 0;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int rockCount = 1;
        System.out.println("I own " + rockCount + " " + pluralize("pet rock", rockCount) + ".");

        int headCount = 1;
        flipNHeads(headCount);

        clock();
    }


    public static String pluralize(String word, int num) {
        if(num == 0 || num > 1){
            return word + "s";
        }
        else return word;
    }
    public static void flipNHeads(int n) {
        int heads = 0;
        int flipCount = 0;
        while(heads < n){
            flipCount = flipCount + 1;
            //https://www.educative.io/answers/how-to-generate-random-numbers-using-random-class-in-java
            Random random = new Random();
            float result = random.nextFloat();
            if(result < .5){
                heads = 0;
                System.out.println("tails");
            }
            else {
                heads = heads + 1;
                System.out.println("heads");
            }
        }
        System.out.println("It took " + flipCount + " flips to flip " + n + " heads in a row.");
    }

    public static void clock() {
        String startTime = getTime();
        String currentTime = getTime();
        
        while(startTime.equals(currentTime)) {
            currentTime = getTime();
            while(!startTime.equals(currentTime)){
                startTime = currentTime;
                System.out.println(startTime);
            }
        }
    }
    
    private static String getTime() {
        LocalDateTime now = LocalDateTime.now();
        String hour = pad(Integer.toString(now.getHour()));
        String minute = pad(Integer.toString(now.getMinute()));
        String second = pad(Integer.toString(now.getSecond()));
        String currentTime = hour + ":" + minute + ":" + second;
        return currentTime;
    }
    
    private static String pad(String time) {
        if(time.length() == 1){
            return "0" + time;
        }
        else return time;
    }

}