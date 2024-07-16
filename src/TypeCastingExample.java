public class TypeCastingExample {
    // 1. Declare integer variables
    static int maxScore = 500;
    static int userScore = 423;

    // 2. Type Casting to Float
    // Convert the integer maxScore to float
    static float maxScoreFloat = (float) maxScore;
    // Convert the integer userScore to float
    static float userScoreFloat = (float) userScore;

    // 3. Perform Floating-Point Division
    // Calculate percentage by dividing userScoreFloat by maxScoreFloat and multiplying by 100
    static float percentage = (userScoreFloat / maxScoreFloat) * 100;

    // 4. Print the Result
    public static void main(String[] args) {
        // Output the calculated percentage
        System.out.println("Percentage: " + percentage); // Output: 84.6
    }
}
