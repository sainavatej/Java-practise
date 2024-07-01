import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String args[]){
        HashSet<Integer> h = new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(2);
        h.add(4);
        h.add(5);

        Iterator<Integer> i= h.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        HashSet<Character> letters= new HashSet<>();
        for(char j='a';j<= 'z';j++){
            letters.add(j);
        }
        Iterator<Character> it=letters.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        HashSet<String> hs = new HashSet<String>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
