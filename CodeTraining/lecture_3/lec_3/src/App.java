public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = { 32,15,2,17,19,26,41,17,17};
        
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
