import java.util.HashMap;

public class HM3occurenceOfWordsCount {
    // Method to find the occurrence of each word in a string
    public static HashMap<String, Integer> occurenceOfWords(HashMap<String,Integer> hm, String line) {
        // Split the input line into words using space as a delimiter
        String words[] = line.split(" ");

        // Create a new HashMap to store the word counts
        HashMap<String,Integer> hm1 = new HashMap<>();

        // Iterate over each word in the words array
        for (String word : words) {
            // Check if the word is already in the HashMap
            if (hm1.containsKey(word)) {
                // If the word is present, increment its count by 1
                hm1.put(word, hm1.get(word) + 1);
            } else {
                // If the word is not present, add it with a count of 1
                hm1.put(word, 1);
            }

            // Check if the word count is greater than 1 (duplicate)
            if (hm1.get(word) > 1) {
                // Print the duplicate word and also print the no of times the word is repated
                System.out.println("Duplicates are: " + word +", "+ "Duplicate word repeated times:"+hm1.get(word));
            }
        }
        // Return the HashMap containing the word counts
        return hm1;
    }

    public static void main(String[] args) {
        // Create a new HashMap to pass as a parameter
        HashMap<String, Integer> hm = new HashMap<>();

        // Define a string line to count the words
        String line = "My Name is Konda Sai Navatej, it is very hot";

        // Create an instance of the HM3occurenceOfWordsCount class
        HM3occurenceOfWordsCount hm2containsKeyValidate = new HM3occurenceOfWordsCount();

        // Call the occurenceOfWords method and print the result
        System.out.println(occurenceOfWords(hm, line));
    }
}
