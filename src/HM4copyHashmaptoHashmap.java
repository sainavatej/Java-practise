import java.util.HashMap;

public class HM4copyHashmaptoHashmap {

    public static void main(String[] args) {
        HashMap<Integer,String> hm1= new HashMap<>();
        hm1.put(1,"Gopal");
        hm1.put(2,"Navatej");
        hm1.put(3,"Nirbhai");

        HashMap<Integer, String> hm2= hm1;
        System.out.println(hm2);


    }
}
