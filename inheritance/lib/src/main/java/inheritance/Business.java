package inheritance;

import java.util.ArrayList;

public class Business {

    private String name;
    private int averageRating;
    private String priceCategory;
    // TODO: limit priceCategory to "$", "$$", "$$$", or "$$$$"
    private ArrayList<Review> reviewsList = new ArrayList();

    private String businessType;

    public Business(String name, String priceCategory, String businessType) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.businessType = businessType;
    }

    public static void addReview(String body, String author, int rating, Business business) {
        Review review = new Review(body, author, rating, business);
        business.reviewsList.add(review);
        updateAverageRating(business);
    }
//
//    public static void addReview(String body, String author, int rating, Restaurant restaurant) {
//        Review review = new Review(body, author, rating, restaurant);
//        restaurant.getReviewsList().add(review);
//        updateAverageRating(restaurant);
//    }

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
                if(i < (business.reviewsList.size() - 1)) {
                    allReviews += "\n";
                }
            }
        }
        return allReviews;
    }

    public static String toBusinessString(Business business) {
        String allReviews = getAllReviews(business);
        String businessDescription = business.name + ": " + business.averageRating + " stars, " + business.priceCategory + allReviews;
        return businessDescription;
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

    public void setReviewsList(ArrayList reviewsList) {
        this.reviewsList = reviewsList;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
}
