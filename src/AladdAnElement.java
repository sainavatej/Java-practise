import java.util.ArrayList;
import java.util.Scanner;

public  class AladdAnElement {
    public static void main(String[] args) {
Addelements addelements= new Addelements();
addelements.addToList();

    }

    public static class Addelements{
        public  ArrayList<String> addToList(){
            ArrayList<String> al = new ArrayList<>();
            System.out.println("Enter The elements needed :");
            Scanner sc= new Scanner(System.in);

            // If we want to add String elements by user using scanner then we use nextLine();
            String s = sc.nextLine();
al.add(s);
            System.out.println(al);
            return al;
        }
    }
}
