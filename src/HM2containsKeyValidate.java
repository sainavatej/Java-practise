import java.util.*;
public class HM2containsKeyValidate {
    public Boolean containskey(HashMap<Integer,String> hm){
        System.out.println("Enter Your Key to Validate");
        Scanner sc= new Scanner(System.in);
        int key= sc.nextInt();

        if(hm.containsKey(key)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        HashMap<Integer, String> hm= new HashMap<>();
        hm.put(1,"Gopal");
        hm.put(2,"Navatej");
        hm.put(3,"Nirbhai");

        HM2containsKeyValidate hm2containsKeyValidate= new HM2containsKeyValidate();
        System.out.println(hm2containsKeyValidate.containskey(hm));
    }
}
