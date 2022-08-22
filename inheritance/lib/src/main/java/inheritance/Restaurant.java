package inheritance;

public class Restaurant {
    String name = "";
    float averageRating = 0.0f;
    String priceCategory = "";

    public Restaurant(String name, float averageRating, String priceCategory) {
        this.name = name;
        this.averageRating = averageRating;
        this.priceCategory = priceCategory;
    }

    public String toRestString(Restaurant restaurant) {
        String restaurantDescription = restaurant.name + ": " + restaurant.averageRating + " stars, " + priceCategory;
        return restaurantDescription;
    }

}
