package selectionSort;

public class SelectionSort {

	
		// TODO Auto-generated method stub

	
	
	    public static void selectionSort(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            int minIdx = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIdx]) {
	                    minIdx = j;
	                }
	            }
	            swap(arr, i, minIdx);
	        }
	    }

	    private static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

	    public static void main(String[] args) {
	        int[] arr = {29, 10, 14, 37, 13};
	        selectionSort(arr);
	        System.out.println("Sorted array:");
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	    }
	}


