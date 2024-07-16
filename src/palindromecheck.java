import java.util.Scanner;

public class palindromecheck {
    public static void main(String[] args) {
        method1();

    }

    public static void method1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int a= sc.nextInt();
        int original=a;
        int reversed = 0;
        while (a != 0) {
            int digit = a % 10;   // Extract the last digit
            reversed = reversed * 10 + digit;  // Append the digit to the reversed number
            a /= 10;  // Remove the last digit
        }
        System.out.println("Reversed number: " + reversed);

if(original==reversed){
    System.out.println("True");
}else{
    System.out.println("False");
}
    }

}
