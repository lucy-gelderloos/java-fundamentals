package inheritance;

public class Restaurant {
    String name = "";
    int averageRating = 0;
    String priceCategory = "";
    LinkedList reviewsList = new LinkedList();

    public Restaurant(String name, int averageRating, String priceCategory) {
        this.name = name;
        this.averageRating = averageRating;
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
        Node thisReview = reviewsList.head;
        while(thisReview != null){
            totalStars += thisReview.getValue().rating;
            thisReview = thisReview.getNext();
        }
        restaurant.averageRating = Math.round(totalStars / numReviews);
    }

    public static String getAllReviews(Restaurant restaurant) {
        String allReviews = "";
        if(restaurant.reviewsList.head != null) {
            allReviews = "/n";
            Node thisReview = restaurant.reviewsList.head;
            while (thisReview != null) {
                allReviews += Review.toReviewString(thisReview.getValue()) + "/n";
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

}
