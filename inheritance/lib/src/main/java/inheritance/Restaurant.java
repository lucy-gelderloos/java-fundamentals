package inheritance;

public class Restaurant {
    String name = "";
    int averageRating = 0;
    String priceCategory = "";

    LinkedList reviewsList;
//    LinkedList reviewsList = new LinkedList();

    int numReviews = 0;

    public Restaurant(String name, int averageRating, String priceCategory, LinkedList reviewsList) {
        this.name = name;
        this.averageRating = averageRating;
        this.priceCategory = priceCategory;
        this.reviewsList = reviewsList;
    }

    public String toRestString(Restaurant restaurant) {
        String restaurantDescription = restaurant.name + ": " + restaurant.averageRating + " stars, " + restaurant.priceCategory;
        return restaurantDescription;
    }

    public void updateAverageRating(Restaurant restaurant) {
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

    public void addReview(Review review, Restaurant restaurant) {
        restaurant.numReviews++;
        restaurant.reviewsList.insert(review);
    }
}
