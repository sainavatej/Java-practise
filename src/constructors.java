public class constructors {
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
