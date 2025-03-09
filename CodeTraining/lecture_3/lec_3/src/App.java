/*
 * Insertion Sort
 */

public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = { 32,15,2,17,19,26,41,17,17};
        // first_method(arr);
        second_method(arr);

    }
    public static void second_method(int arr[]){
        for (int i=1 ; i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for (int i = 0 ;i<arr.length-1;i++){
            System.out.println(arr[i]);
         }

    }
    
    public static void first_method(int arr[]){
        
        int temp =0;
        for(int j=0;j<arr.length-1;j++){
            for (int i = 0 ;i<arr.length-1;i++){
            if(arr[i+1]<=arr[i]){
                temp =arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            }
        }
        for (int i = 0 ;i<arr.length-1;i++){
           System.out.println(arr[i]);
        }
    }
}
