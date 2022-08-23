package inheritance;

public class Review {
    String body = "";
    String author = "";
    int rating = 0;
    Restaurant restaurant;
    public Review(String body, String author, int rating, Restaurant restaurant) {
        this.restaurant = restaurant;
        this.body = body;
        this.author = author;
        this.rating = rating;
    }

    public String toReviewString(Review review) {
        String restaurantDescription = restaurant.name + ": " + review.body + " | " + review.rating + " stars. -" + review.author;
        return restaurantDescription;
    }
}
