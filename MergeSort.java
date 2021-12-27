/**
 * MergeSort
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {5,4,8,9,10,6,20,-1,5};
		mergesort(arr);
		printSortedarray(arr);
	}

	private static void printSortedarray(int[] arr) {
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
	}

	private static void mergesort(int[] arr) {
		int n = arr.length;
		if(n<2)
		return;
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		for(int i=0;i<mid;i++){
			left[i]  =arr[i];
		}
		for(int j=0;j<n-mid;j++){
			right[j] = arr[mid+j];
		}
		mergesort(left);
		mergesort(right);
		merge(left, right, arr);
	}

	private static void merge(int[] left, int[] right, int[] arr) {
		int n1 = left.length;
		int n2 = right.length;
		int i=0; int j=0; int k = 0;
		while(i<n1 && j<n2){
			if(left[i]<=right[j]){
				arr[k] = left[i]; 
				i++;
			}
			else{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			arr[k] = left[i];
			i++; k++;
		}
		while(j<n2){
			arr[k] = right[j];
			j++; k++;
		}
	}
}