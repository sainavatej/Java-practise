import java.util.ArrayList;

public class Al6compareTwoLists {
    public static void main(String[] args) {
       // Al6compareTwoLists al6compareTwoLists= new Al6compareTwoLists();
        ArrayList<Integer> a1= new ArrayList<>();
  ArrayList<Integer> a2= new ArrayList<>();
        System.out.println(Al6compareTwoLists.compare(a1, a2));
    }

    public static boolean compare( ArrayList<Integer> a1,  ArrayList<Integer>a2){
        for (int i=1;i<=5;i++){
            a1.add(i);
        }
        for (int j=1;j<=5;j++){
            a2.add(j);
        }

        if(a1.equals(a2)){
            return true;
        }
        return false;


    }

}
