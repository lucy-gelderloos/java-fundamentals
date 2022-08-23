package inheritance;

public class Review {
    private String body;
    private String author;
    private int rating;
    private Restaurant restaurant;

    public Review(String body, String author, int rating) {
        this.restaurant = restaurant;
        this.body = body;
        this.author = author;
        this.rating = rating;
    }

    // TODO: limit rating to between 0 and 5
    // TODO: add User property
    // TODO: limit user to one review per restaurant

    public static String toReviewString(Review review) {
        String fullReview = review.body + " | " + review.rating + " stars. -" + review.author;
        return fullReview;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

}
