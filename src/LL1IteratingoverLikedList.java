import java.util.Iterator;
import java.util.LinkedList;

public class LL1IteratingoverLikedList {
    public void iterating(){
        LinkedList<Integer> ll= new LinkedList<>();
        for(int i=1;i<=10;i++){
            ll.add(i);
        }
        Iterator<Integer> itr= ll.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

    }

    public static void main(String args[]){
        LL1IteratingoverLikedList ll1iterating = new LL1IteratingoverLikedList();
        ll1iterating.iterating();
    }

}
