package inheritance;

import java.util.ArrayList;

public class Business {

    private String name;
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

    public static void addReview(String body, String author, int rating, Theater theater, String movie) {
        body += " I saw " + movie + ".";
        Review review = new Review(body, author, rating, theater);
        Theater.addMovie(theater, movie);
        theater.getReviewsList().add(review);
        updateAverageRating(theater);
    }

    public static int updateAverageRating(Business business) {
        int totalStars = 0;
        int averageRating;
        for (Review review : business.reviewsList) {
            totalStars += review.getRating();
        }
        if(business.reviewsList.size() == 0) {
            averageRating = 0;
        } else { averageRating = Math.round(totalStars / business.reviewsList.size()); }
        return averageRating;
    }

    public static String getAllReviews(Business business) {
        String allReviews = "";
        if(business.reviewsList.size() > 0) {
            allReviews = "\nReviews:\n";
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
        String businessDescription = business.name + ": " + updateAverageRating(business) + " stars, " + business.priceCategory + getAllReviews(business);
        return businessDescription;
    }

    public static String toBusinessString(Restaurant restaurant) {
        // overload toBusinessString to include chainName
        String chainName = "";
        if(restaurant.getChainName() != "") {
            chainName = " (a location of " + restaurant.getChainName() + ")";
        }
        String restaurantDescription = restaurant.getName() + chainName + ": " + updateAverageRating(restaurant) + " stars, " + restaurant.getPriceCategory() + getAllReviews(restaurant);
        return restaurantDescription;
    }

    public static String toBusinessString(Theater theater) {
        // overload toBusinessString to include list of movies
        String theaterDescription = theater.getName() + ": " + updateAverageRating(theater) + " stars, " + theater.getPriceCategory() + Theater.getAllMovies(theater) + getAllReviews(theater);
        return theaterDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
