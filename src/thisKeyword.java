public class thisKeyword {

    //This Keyword is used to access the Class level variables or methods
    //This keyword cannot be used in static methods or static code block.
    //This keyword will helps us to differentiate between class variable and parameter passed variable

    int i=20;
    int j=20;

    public static void main(String args[]){
        thisKeyword tk= new thisKeyword();
        tk.add(20,30);
    }

    public void add(int i, int j) {
        System.out.println(this.i+this.j);
    }
}
