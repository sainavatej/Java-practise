public class StringConcatenationVsStringBuilder {
    public static void main(String args[]){
        int arr[] = {1, 2, 4};

        // Using String concatenation
        String str = "";
        for (int a : arr) {
            str = str + a;
        }
        System.out.println("Using String: " + str);  // Output: 124

        // Using StringBuilder
        StringBuilder strBuilder = new StringBuilder();
        for (int a : arr) {
            strBuilder.append(a);
        }
        System.out.println("Using StringBuilder: " + strBuilder.toString());  // Output: 124
    }
}
