import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class stack {
    public static void main(String args[]){
        Stack<Character> letters= new Stack<>();

        //LIFO - Last In First Out
        for(char i='a'; i<= 'z';i++){
            letters.push(i);
        }
System.out.println(letters);
        System.out.println(letters.pop());
        System.out.println(letters);
        System.out.println(letters.peek());
        System.out.println(letters);

        System.out.println(letters.get(8));

        Iterator<Character> i = letters.iterator();
        while (i.hasNext()){
            if(i.next()=='s'){
                i.remove();
            }
        }

        System.out.println(letters);

    }
}
