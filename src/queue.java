import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

//QUEUE IS FIFO -First in First out
// q.add - FOR ADDING THE ELEMENTS TO THE QUEUE
//q,peek - It returns the first element from the queue as its queue follows FIFO so first element will be the first element added in the queue
//q.poll - it returns the first element from the queue but it removes this element from the queue
//.clear method is used to clear the elements which present in the queue or stack
//Queue implements Priority queue
public class queue {
    public static void main(String args[]){
        Queue<Integer> q= new PriorityQueue<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        Iterator<Integer> i = q.iterator();
        while (i.hasNext()){
            System.out.print(i.next() +" ");
        }
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
    }

}
