import java.util.*;

public class AL1MinElementMaxelement {
    public void Ordering(){
        List<Integer> order = new ArrayList<>();
        for(int i=10; i<=15;i++){
            order.add(i);
        }
        int Min= Collections.min(order);
        int Max= Collections.max(order);
        System.out.println("Min Value is :"+ Min);
        System.out.println("Max Value is :"+ Max);

    }
    public static void main(String args[]){
AL1MinElementMaxelement order = new AL1MinElementMaxelement();
    order.Ordering();
    }
}
