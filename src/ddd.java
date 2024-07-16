import java.util.ArrayList;
import java.util.Scanner;

public  class ddd {
    public static void main(String[] args) {
        Addelements addelements= new Addelements();
        addelements.addToList();

    }

    public static class Addelements{
        public  ArrayList<Integer> addToList(){
            ArrayList<Integer> al = new ArrayList<>();
            System.out.println("Enter The elements needed :");
            Scanner sc = new Scanner(System.in);

            // If we want to add String elements by user using scanner then we use nextLine();
            int s = sc.nextInt();
            while (true) {

                if (s == -1) {
                    break;
                }
                al.add(s);
            }
           System.out.println(al);
            return al;
        }
    }
}
