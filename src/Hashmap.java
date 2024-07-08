import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public void hashmap() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Navatej");
        hm.put(2, "Gopal");
        hm.put(3 , "Nirbhai");

        System.out.println(hm);

        //Iterating through map using foreach and keyset
        for (Integer key:hm.keySet()){
            System.out.println(key +" "+ hm.get(key));
        }

        //Itersting over map using foreach and entryset
        for (Map.Entry<Integer , String> key : hm.entrySet()){
            System.out.println(key.getKey() + " " + key.getValue());
        }

        //Iterating by using Values
        for (String value : hm.values()){
            System.out.println(value);     // it prints the values

        }



        boolean iscontains= hm.containsKey(1);
        boolean iscontains2= hm.containsValue("Gopal22");
        System.out.println(iscontains2 );
        System.out.println(iscontains);

    }
    public static void main(String args[]){
Hashmap hashmap1 = new Hashmap();
hashmap1.hashmap();
    }
}
