public class App {
    public static void main(String[] args) {
        int arr[] = {10, 9, 5, 13, 2, 7, 1, 8, 4, 6, 3};
        int maxright = arr[arr.length-1];
        System.out.println(maxright);
        for (int i=arr.length-2 ;i>=0;i--){
            if(arr[i]>maxright){
                System.out.println(arr[i]);
                maxright = arr[i];
            }
        }
    }
}
