package Sorting;

public class QuickSort {
    
    public static void qst(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            
            qst(arr, low, pivotIndex - 1);
            qst(arr, pivotIndex + 1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for(int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 8, 2, 7, 3, 6, 4};
        
        System.out.println("Array before sorting:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        
        qst(arr, 0, arr.length - 1);
        
        System.out.println("\nArray after sorting:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
