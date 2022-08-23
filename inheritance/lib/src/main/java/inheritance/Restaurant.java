package inheritance;

public class Restaurant {
    private String name;
    private int averageRating;
    private String priceCategory;
    // TODO: limit priceCategory to "$", "$$", "$$$", or "$$$$"
    private LinkedList reviewsList = new LinkedList();

    public Restaurant(String name, String priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
    }

    public static void addReview(String body, String author, int rating, Restaurant restaurant) {
        Review review = new Review(body, author, rating);
        restaurant.reviewsList.insert(review);
        updateAverageRating(restaurant);
    }

    public static void updateAverageRating(Restaurant restaurant) {
        LinkedList reviewsList = restaurant.reviewsList;
        int numReviews = reviewsList.countNodes();
        int totalStars = 0;
        Node thisReview = reviewsList.getHead();
        while(thisReview != null){
            totalStars += thisReview.getValue().getRating();
            thisReview = thisReview.getNext();
        }
        restaurant.averageRating = Math.round(totalStars / numReviews);
    }

    public static String getAllReviews(Restaurant restaurant) {
        String allReviews = "";
        if(restaurant.reviewsList.getHead() != null) {
            allReviews = "\n";
            Node thisReview = restaurant.reviewsList.getHead();
            while (thisReview != null) {
                allReviews += Review.toReviewString(thisReview.getValue()) + "\n";
                // TODO: no newline in last iteration
                thisReview = thisReview.getNext();
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

    public LinkedList getReviewsList() {
        return reviewsList;
    }

    public void setReviewsList(LinkedList reviewsList) {
        this.reviewsList = reviewsList;
    }

}
