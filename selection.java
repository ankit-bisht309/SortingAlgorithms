public class selection {
    public static void main(String[] args) {
        int[] arr = {9,6,2,4,8,20,8};
        selectionSort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    private static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int minElementIndex = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[minElementIndex]>arr[j]){
                    minElementIndex = j;
                }
            }
            arr[i] = arr[i]^arr[minElementIndex];
            arr[minElementIndex] = arr[minElementIndex]^arr[i];
            arr[i] = arr[i]^arr[minElementIndex];

        }
    }
    
}
