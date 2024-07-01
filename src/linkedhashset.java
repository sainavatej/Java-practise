import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String args[]){

        LinkedHashSet<String> lh= new LinkedHashSet<>();
        lh.add("Sai");
        lh.add("Navatej");
        lh.add("konda");

        Iterator<String> itr= lh.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }

}
