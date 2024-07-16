import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LL2convertingAltoLL {
    public static void main(String[] args) {
            ArrayList<Integer> al= new ArrayList<>();
            LinkedList<Integer> ll= new LinkedList<>();
for (int i=1;i<5;i++) {
    al.add(i);
}
            LL2convertingAltoLL.Convert(al,ll);

    }

    public static void Convert(ArrayList<Integer> al, LinkedList<Integer> ll){

        for (int a:al){
            ll.add(a);
        }
        System.out.println(ll);
    }


}
