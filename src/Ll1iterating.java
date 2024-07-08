import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Ll1iterating {
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
        Ll1iterating ll1iterating = new Ll1iterating();
        ll1iterating.iterating();
    }

}
