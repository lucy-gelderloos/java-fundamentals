package inheritance;

import java.util.ArrayList;

public class Restaurant extends Business {

    private String chainName;

    public Restaurant(String name, String priceCategory, String chainName, String businessType) {
        super(name, priceCategory, businessType);
        // for now, if restaurant isn't part of a chain, set chainName to empty string
        this.chainName = chainName;
    }

    public static String toRestaurantString(Restaurant restaurant) {
        String allReviews = Business.getAllReviews(restaurant);
        String chainName = "";
        if(restaurant.getChainName() != "") {
            chainName = " (a location of " + restaurant.getChainName() + ")";
        }
        String restaurantDescription = restaurant.getName() + chainName + ": " + restaurant.getAverageRating() + " stars, " + restaurant.getPriceCategory() + allReviews;
        return restaurantDescription;
    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName;
    }
}
