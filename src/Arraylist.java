import java.awt.*;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // Creating an ArrayList of Integer type
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        // Displaying the ArrayList
        System.out.println("Original list: " + numbers);

        // Getting the value at index 4 (5th element)
        int valueAtIndex4 = numbers.get(4);
        System.out.println("Element at index 4: " + valueAtIndex4);

        // Removing the element at index 4
        numbers.remove(4);
        System.out.println("List after removing element at index 4: " + numbers);

        // Removing an element by value (e.g., remove the number 2)
        numbers.remove(Integer.valueOf(2));
        System.out.println("List after removing the value 2: " + numbers);

        // Adding a new element at a specific position
        numbers.add(4, 100); // Adding 100 at index 4
        System.out.println("List after adding 100 at index 4: " + numbers);

        // Adding an element to the end of the ArrayList
        numbers.add(11);
        System.out.println("List after adding 11 at the end: " + numbers);

        // Swapping the first element to the end of the ArrayList
        if (!numbers.isEmpty()) {
            int firstElement = numbers.get(0); // Retrieve the first element
            numbers.remove(0); // Remove the first element
            numbers.add(firstElement); // Add the first element to the end
        }
        System.out.println("List after moving the first element to the end: " + numbers);


        ArrayList<Integer> a= new ArrayList<>();
        //int array[]= new int[10];
      int  array[]={1,2,55,3,4,2,3,2,4,4};
      for(int i=0;i< array.length;i++){
if(array[i]==array[i+1]){
    System.out.println(array[i]);
    break;
}
      }
    }
}
