package inheritance;

import java.util.ArrayList;

public class User {

    private String username;
    private ArrayList<Review> reviewsList = new ArrayList<>();

    public User(String username) {
        this.username = username;
    }

    // when a review is added to a business, check if that business has any reviews already by that user


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Review> getReviewsList() {
        return reviewsList;
    }

    public void setReviewsList(ArrayList<Review> reviewsList) {
        this.reviewsList = reviewsList;
    }

}
