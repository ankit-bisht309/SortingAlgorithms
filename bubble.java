public class bubble {
    public static void main(String[] args) {
        int[] arr = {5,4,8,6,7};
        bubblesort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void bubblesort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    arr[j] = arr[j]^arr[j+1];
                    arr[j+1] = arr[j+1]^arr[j];
                    arr[j] = arr[j]^arr[j+1];
                }
            }
        }
    }
    
}
