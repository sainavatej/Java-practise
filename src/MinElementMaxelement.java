import java.util.*;

public class MinElementMaxelement {
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
MinElementMaxelement order = new MinElementMaxelement();
    order.Ordering();
    }
}
