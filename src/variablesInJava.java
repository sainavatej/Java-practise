public class variablesInJava {
    // Instance variable
    String color;

    // Static variable
    static int numberOfWheels = 4;

    // Method to set color (uses parameter)
    public void setColor(String color) {
        // Using 'this' to distinguish between instance variable and parameter
        this.color = color;
    }

    // Method to display color (uses local variable)
    public void displayColor() {
        // Local variable
        String message = "Car color: " + color;
        System.out.println(message);
    }

    // Static method to display number of wheels
    public static void displayNumberOfWheels() {
        System.out.println("Number of wheels: " + numberOfWheels);
    }

    public static void main(String[] args) {
        // Accessing static variable directly using class name
        variablesInJava.displayNumberOfWheels(); // Output: Number of wheels: 4

        // Creating an object to access instance variables and methods
        variablesInJava car1 = new variablesInJava();
        car1.setColor("Red");
        car1.displayColor(); // Output: Car color: Red

        variablesInJava car2 = new variablesInJava();
        car2.setColor("Blue");
        car2.displayColor(); // Output: Car color: Blue
    }
}
