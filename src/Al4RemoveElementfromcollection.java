import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class Al4RemoveElementfromcollection {

    public void Indexelementremover() {
        List<Integer> li= new ArrayList<>();
        for(int i=10; i<=15;i++){
            li.add(i);
        }
        System.out.println("ACTUAL LIST IS:"+li);
        System.out.println("Enter your Index No to delete:" );
        Scanner sc= new Scanner(System.in);
        int input= sc.nextInt();

        if(input >=0 && input < li.size()){
            li.remove(input);
            System.out.println("lIST AFTER REMOVAL:"+li);
            }else {
                System.out.println("The Index Element is not present in the List");
        }
        System.out.println(li.size());
    }
    public static void main(String args[]){

        Al4RemoveElementfromcollection removeElementfromcollection= new Al4RemoveElementfromcollection();
        removeElementfromcollection.Indexelementremover();
    }

}
