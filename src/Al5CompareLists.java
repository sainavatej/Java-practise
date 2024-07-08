import java.util.ArrayList;
import java.util.List;

public class Al5CompareLists {
    public Boolean compare(){
        List<String> al1= new ArrayList<>();
        List<String> al2= new ArrayList<>();
        al1.add("Hello");
        al1.add("Konda");
        al1.add("Sai");

        al2.add("Hello");
        al2.add("Konda");
        al2.add("Saiii");

        if(al1.equals(al2)){
            return true;
        }
        return false;

    }
    public static void main(String args[]){
Al5CompareLists al5CompareLists= new Al5CompareLists();
        System.out.println(al5CompareLists.compare());
    }

}
