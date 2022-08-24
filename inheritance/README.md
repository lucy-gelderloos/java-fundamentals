# Inheritance

## Architecture

### Business.java

- Children:
  - Restaurant
  - Shop
  - Theater
- Properties:
  - String `name`  
  - String `priceCategory`
  - String `businessType`
  - ArrayList<String> `reviewsList`
- Constructor
  - *Business(String name, String priceCategory, String businessType)*
- Methods
  - *addReview(String body, String author, int rating, Business business)* adds a review to the business' list of reviews, then calls *updateAverageRating*.
  - *addReview(String body, String author, int rating, Theater theater, String movie)* adds a review including the movie viewed to the theater's list of reviews, then calls *updateAverageRating*.
  - *updateAverageRating(Business business)* iterates through the business' list of reviews, sums each rating, and divides by the total number of reviews to get the average rating.
  - *getAllReviews(Business business)* first determines if the review list has any entries; if no, it returns an empty string. If yes, it starts with an output string with "Review:" on a single line. It then iterates through the restaurant's list of reviews, calls *Review.toReviewString* on each, and adds each resulting string. Each review string except the last is followed by a newline.
  - *toBusinessString(Business business)* concatenates the business' name, rating, and price category, followed by the string returned from *getAllReviews*.
  - *toBusinessString(Restaurant restaurant)* concatenates the restaurant's name, chain name (if present), rating, and price category, followed by the string returned from *getAllReviews*.
  - *toBusinessString(Theater theater)* concatenates the theater's name, rating, and price category, followed by the string returned from *Theater.getAllMovies*, followed by the string returned from *getAllReviews*.
- **Notes:**
  - `priceCategory` options are "$", "$$", "$$$", "$$$$"
  - `businessType` options are "restaurant", "shop", "theater"

### Restaurant.java

- Properties:
  - Inherits `name`, `priceCategory`, `averageRating`, `reviewsList` from Business
  - String `chainName`
- Constructor:
  - *Restaurant(String name, String priceCategory, String chainName, String businessType)*
- Methods:
  - Inherits *addReview*, *updateAverageRating*, *getAllReviews*, *toBusinessString* from Business
- **Notes:**
  - `priceCategory` options are "$", "$$", "$$$", "$$$$"
  - `businessType` options are "restaurant", "shop", "theater"
  - If restaurant is not part of a chain, chainName is ""

### Shop.java

- Properties:
  - Inherits `name`, `priceCategory`, `averageRating`, `reviewsList` from Business
- Constructor:
  - *Shop(String name, String priceCategory, String businessType)*
- Methods:
  - Inherits *addReview*, *updateAverageRating*, *getAllReviews*, *toBusinessString* from Business
- **Notes:**
  - `priceCategory` options are "$", "$$", "$$$", "$$$$"
  - `businessType` options are "restaurant", "shop", "theater"

### Theater.java

- Properties:
  - Inherits `name`, `priceCategory`, `averageRating`, `reviewsList` from Business
  - `ArrayList<String>` currentMovies
- Constructor:
  - *Theater(String name, String priceCategory, String businessType)*
- Methods:
  - Inherits *addReview*, *updateAverageRating*, *getAllReviews*, *toBusinessString* from Business
  - *addMovie(Theater theater, String movie)* checks if the provided movie is in the provided theater's list of movies, and if it's not there, adds it to the list
  - *removeMovie(Theater theater, String movie)* removes the provided movie from the theater's list of movies
  - *getAllMovies(Theater theater)* iterates through the theater's list of movies and outputs them in a string beginning with "Now Playing: ". If the list of movies is empty, returns an empty string. 
- **Notes:**
  - `priceCategory` options are "$", "$$", "$$$", "$$$$"
  - `businessType` options are "restaurant", "shop", "theater"  

### Review.java

- Properties
  - String `body`
  - String `author`
  - int `rating`
  - Business `business`
- Constructor
  - *Review(Business business, String body, String author, int rating)*
- Methods
  - *toReviewString(Review review)* concatenates the review body, rating, and author
  - *updateStars(Review review, int newRating)* updates the star rating of the provided review with the provided value

## Testing

- *testConstructors* confirms that the constructors for the Restaurant, Shop, and Theater classes work correctly
- *testToString* confirms that Business.toBusinessString returns a string with the correct info and formatting under various conditions:
  - The business has no reviews (format should be "<business name>: <rating> stars, <price category>")
  - The business has reviews (format should be "<business name>: <rating> stars, <price category><newline>Reviews:<newline><each review on its own line>)
  - The business is a chain restaurant (format should be "<business name> (a location of <chain name>): <rating> stars, <price category>")
  - The business is a movie theater with multiple movies playing and multiple reviews (format should be "<business name>: <rating> stars, <price category><newline>Now Playing: <each movie in the theater's movie list, separated by a comma><newline>Reviews:<newline><each review on its own line>)
- *testReviewConstructor* confirms that the body, author, and rating properties of the generated review match the input
- *testReviewString* confirms that the string generated by *Review.toReviewString* matches the following format: "<body> | <rating> stars. -<author>"
- *testAddReview* confirms that after adding a single review to a business, the length of that business' list of reviews is 1
- *testAddRemoveMovies* confirms that movies can be added to and removed from a theater's list of movies; that duplicate movies will not be added; and that if a review is submitted that references a movie not in the list, that movie will be added.
