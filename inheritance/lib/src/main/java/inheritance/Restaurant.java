package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int averageRating;
    private String priceCategory;
    // TODO: limit priceCategory to "$", "$$", "$$$", or "$$$$"
    private ArrayList<Review> reviewsList = new ArrayList();

    public Restaurant(String name, String priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
    }

    public static void addReview(String body, String author, int rating, Restaurant restaurant) {
        Review review = new Review(body, author, rating, restaurant);
        restaurant.reviewsList.add(review);
        updateAverageRating(restaurant);
    }

    public static void updateAverageRating(Restaurant restaurant) {
        int totalStars = 0;
        for (Review review : restaurant.reviewsList) {
            totalStars += review.getRating();
        }
        restaurant.averageRating = Math.round(totalStars / restaurant.reviewsList.size());
    }

    public static String getAllReviews(Restaurant restaurant) {
        String allReviews = "";
        if(restaurant.reviewsList.size() > 0) {
            allReviews = "\n";
            for (int i = 0; i < restaurant.reviewsList.size(); i++ ) {
                allReviews += Review.toReviewString(restaurant.reviewsList.get(i));
                while(i < (restaurant.reviewsList.size() - 1)) {
                    allReviews += "\n";
                }
            }
        }
        return allReviews;
    }

    public static String toRestString(Restaurant restaurant) {
        String allReviews = getAllReviews(restaurant);
        String restaurantDescription = restaurant.name + ": " + restaurant.averageRating + " stars, " + restaurant.priceCategory + allReviews;
        return restaurantDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public ArrayList getReviewsList() {
        return reviewsList;
    }

    public void ArrayList(ArrayList reviewsList) {
        this.reviewsList = reviewsList;
    }

}
