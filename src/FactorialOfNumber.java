import java.util.Scanner;

public class FactorialOfNumber {
   // public class navatej {

        public static int factorial(int n) {
            if (n == 0) {
                return 1;
            }
            return n * factorial(n - 1);
        }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Factorial Number :");
        int n = sc.nextInt();
        FactorialOfNumber factorial1 = new FactorialOfNumber();
        System.out.println("facotial of the number is :"+factorial1.factorial(n));
    }

}
