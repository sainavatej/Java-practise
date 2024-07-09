public class constructors {
    //Constructors are used to Allocate memory so that we can assign a value for a variable.
    // constructors is similar to methods but these are accessed while creating the objects whereas the methods are accessed after creating the objects
    //these are of two types - Default constructor and parameterised constructor, by default java will provide a default constructor, if u create a constructor then java will take that constructor
    //constructor should be same name as the class name and also there will be no return type for constructors


    // Instance variables
    String color;
    int speed;

    // Default constructor
    public constructors() {
        this.color = "Red";
        this.speed = 0;
    }

    // Parameterized constructor
    public constructors(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car color: " + color + ", Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        // Using default constructor
        constructors car1 = new constructors();
        car1.displayDetails(); // Output: Car color: Red, Speed: 0 km/h

        // Using parameterized constructor
        constructors car2 = new constructors("Blue", 100);
        car2.displayDetails(); // Output: Car color: Blue, Speed: 100 km/h
    }
}
