import java.util.*;
public class Al3ReplaceElement {
    public void replace() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println(al);

        System.out.println("Enter Your Index :");
        Scanner indx= new Scanner(System.in);
        int index= indx.nextInt();

        if(index <0 || index > al.size()){
            System.out.println("Invalid Index");
            indx.close();
            return;
        }
        System.out.println("Enter your Number to Replace:");

        Scanner sc= new Scanner(System.in);
        int input= sc.nextInt();


        al.set(index,input);
        System.out.println(al);

    }   public static void main (String args[]){
Al3ReplaceElement replaceElement= new Al3ReplaceElement();
replaceElement.replace();

        }

}
