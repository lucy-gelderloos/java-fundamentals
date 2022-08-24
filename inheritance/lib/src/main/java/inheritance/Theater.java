package inheritance;

import java.util.ArrayList;

public class Theater extends Business {

    private ArrayList<String> currentMovies = new ArrayList<String>();

    public Theater(String name, String priceCategory, String businessType) {
        super(name, priceCategory, businessType);
        this.currentMovies = currentMovies;
    }

    public static String getAllMovies(Theater theater) {
        String allMovies = "";

        if(theater.getCurrentMovies().size() > 0) {
            allMovies = "\nNow Playing: ";
            for (int i = 0; i < theater.getCurrentMovies().size(); i++) {
                allMovies += theater.getCurrentMovies().get(i);
                if (i < (theater.getCurrentMovies().size() - 1)) {
                    allMovies += ", ";
                }
            }
        }
        return allMovies;
    }

    public static void addMovie(Theater theater, String movieTitle) {
        ArrayList<String> currentMovies = theater.getCurrentMovies();
        if(!currentMovies.contains(movieTitle)){
            currentMovies.add(movieTitle);
        }
        theater.setCurrentMovies(currentMovies);
    }

    public static void removeMovie(Theater theater, String movieTitle) {
        ArrayList<String> currentMovies = theater.getCurrentMovies();
        for (int i = 0; i < currentMovies.size(); i++ ) {
            if(currentMovies.get(i).equals(movieTitle)) {
                currentMovies.remove(i);
                break;
            }
        }
        // TODO: handle if moviesList is empty or movie is not in list
    }

    public ArrayList<String> getCurrentMovies() {
        return currentMovies;
    }

    public void setCurrentMovies(ArrayList<String> currentMovies) {
        this.currentMovies = currentMovies;
    }
}
