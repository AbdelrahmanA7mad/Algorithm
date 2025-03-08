public class App {
    public static void main(String[] args) throws Exception {
        int [] arr = {-3,-1, 2, 4, 4, 8, 10, 12};

        // Checking for duplicates using nested loops (O(n^2) complexity)
        System.out.println(check_duplicates_using_2_for(arr));

        // Checking for duplicates using a single loop (O(n) complexity), but assumes a sorted array
        System.out.println(check_duplicates_using_1_for(arr));
    }

    // Method to check for duplicates using two for-loops (brute-force approach)
    public static boolean check_duplicates_using_2_for(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) { // Outer loop iterates through each element
            for (int j = i + 1; j < arr.length; j++) { // Inner loop compares with the remaining elements
                if (arr[i] == arr[j]) { // If a duplicate is found, return true
                    return true;
                }
            }
        }
        return false; // If no duplicates are found, return false
    }

    // Method to check for duplicates using a single loop (efficient, but requires a sorted array)
    public static boolean check_duplicates_using_1_for(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) { // Loop through the array
            if (arr[i] == arr[i + 1]) { // Check if the current element is the same as the next one
                return true;  // If a duplicate is found, return true
            }
        }
        return false; // If no duplicates are found, return false
    }
}
