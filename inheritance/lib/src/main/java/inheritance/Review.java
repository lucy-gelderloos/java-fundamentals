package inheritance;

public class Review {
    private String body;
    private User author;
    private int rating;
    private Business business;

    public Review(String body, User author, int rating, Business business) {
        this.business = business;
        this.body = body;
        this.author = author;
        this.rating = rating;
    }

    // TODO: limit rating to between 0 and 5

    public static String toReviewString(Review review) {
        String fullReview = review.body + " | " + review.rating + " stars. -" + review.getAuthor().getUsername();
        return fullReview;
    }

    public static void updateStars(Review review, int newRating) {
        review.setRating(newRating);
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

}
