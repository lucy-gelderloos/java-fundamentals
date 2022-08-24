package inheritance;

import java.util.ArrayList;

public class Theater extends Business {

    private ArrayList<String> currentMovies;

    public Theater(String name, String priceCategory, String businessType, ArrayList<String> currentMovies) {
        super(name, priceCategory, businessType);
        this.currentMovies = currentMovies;
    }

    public void addMovie(Theater theater, String movieTitle) {
        theater.getCurrentMovies().add(movieTitle);
    }

    public void removeMovie(Theater theater, String movieTitle) {
        ArrayList<String> currentMovies = theater.getCurrentMovies();
        for (int i = 0; i < currentMovies.size(); i++ ) {
            if(currentMovies.get(i).equals(movieTitle)) {
                currentMovies.remove(i);
                break;
            }
        }
    }

    public ArrayList<String> getCurrentMovies() {
        return currentMovies;
    }

    public void setCurrentMovies(ArrayList<String> currentMovies) {
        this.currentMovies = currentMovies;
    }
}
