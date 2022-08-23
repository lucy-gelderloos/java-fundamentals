package inheritance;

import java.util.ArrayList;

public class Business {

    private String name;
    private int averageRating;
    private String priceCategory;
    // TODO: limit priceCategory to "$", "$$", "$$$", or "$$$$"
    private ArrayList<Review> reviewsList = new ArrayList();

    public Business(String name, String priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
    }

    public static void addReview(String body, String author, int rating, Business business) {
        Review review = new Review(body, author, rating, business);
        business.reviewsList.add(review);
        updateAverageRating(business);
    }

    public static void updateAverageRating(Business business) {
        int totalStars = 0;
        for (Review review : business.reviewsList) {
            totalStars += review.getRating();
        }
        business.averageRating = Math.round(totalStars / business.reviewsList.size());
    }

    public static String getAllReviews(Business business) {
        String allReviews = "";
        if(business.reviewsList.size() > 0) {
            allReviews = "\n";
            for (int i = 0; i < business.reviewsList.size(); i++ ) {
                allReviews += Review.toReviewString(business.reviewsList.get(i));
                while(i < (business.reviewsList.size() - 1)) {
                    allReviews += "\n";
                }
            }
        }
        return allReviews;
    }

    public static String toBusinessString(Business business) {
        String allReviews = getAllReviews(business);
        String restaurantDescription = business.name + ": " + business.averageRating + " stars, " + business.priceCategory + allReviews;
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
