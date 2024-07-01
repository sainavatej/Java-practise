public class ArrayDuplicateEkements {

    public static void main(String args[]){
        int arr[]={1,4,3,1,2,1,7,7};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate found element is :"+arr[j]+" "+i);
                }
            }
        }
    }

}
