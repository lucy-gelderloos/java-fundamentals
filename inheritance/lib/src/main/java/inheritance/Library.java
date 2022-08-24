/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        Business testaurant = new Business("The Java Diner","$", "restaurant");
        User aDeveloper = new User("A. Developer");
        User noMoreArrays = new User("NoMoreArrays");
        User pythonFan123 = new User("PythonFan123");
        Business.addReview("I hated this diner",pythonFan123,0,testaurant);
        Business.addReview("Try the linked lists!",noMoreArrays,4,testaurant);
        Business.addReview("Java is great!",aDeveloper,5,testaurant);

        System.out.println(Business.toBusinessString(testaurant));
    }
}
