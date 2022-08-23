package inheritance;

public class Review {
    String body;
    String author;
    int rating;
    Restaurant restaurant;
    public Review(String body, String author, int rating, Restaurant restaurant) {
        this.restaurant = restaurant;
        this.body = body;
        this.author = author;
        this.rating = rating;
    }

    public static String toReviewString(Review review) {
        String fullReview = review.body + " | " + review.rating + " stars. -" + review.author;
        return fullReview;
    }
}
