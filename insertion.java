public class insertion {
    public static void main(String[] args) {
        int[] arr = {9,6,4,3,5,6,10,1,2,-5,5};
       // InsertionSort(arr); //using two for loops
       insertionSort(arr); //using for and while loop

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int currentIndex =i;
            while(currentIndex>0 && current< arr[currentIndex-1]){
                arr[currentIndex] = arr[currentIndex - 1];
                currentIndex-- ; 

            }
            arr[currentIndex] = current;
            
        }
    }

    private static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            for(int j=i-1;j>=0;j--){
                if(current<arr[j]){
                    arr[j+1] = arr[j];
                    arr[j] = current;
                }
            }  
        }
    }
    
}
