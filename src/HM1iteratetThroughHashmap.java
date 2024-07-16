import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

 public class HM1iteratetThroughHashmap {
    public static void main(String[] args) {
       // Map<Integer,String> hm= new Hashmap<Integer,String>();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Gopal");
        map.put(2,"Navatej");
        map.put(3,"Nirbhai");

        //USING ENTRY SET
        for (Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println("Key value :"+ m.getKey() +" " +"Value:"+ m.getValue());
        }

        // Iterator over keys
        Iterator<Integer> keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Iterator over values
        Iterator<String> valueIterator = map.values().iterator();
        while (valueIterator.hasNext()) {
            String value = valueIterator.next();
            System.out.println("Value: " + value);
        }

        //Iterator over EntrySET
        Iterator<Map.Entry<Integer,String>> itr= map.entrySet().iterator();
        while (itr.hasNext()){
            //Creating a Map object in order to store the map keys and values
            Map.Entry<Integer,String> obj= itr.next();
            System.out.println("Values :"+obj.getValue()+ " "+"key :"+obj.getKey());
        }

    }
}
