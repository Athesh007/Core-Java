package Sorting;

public class InsertionSort {
    
    public static void ins(int[] arr) {
        int n = arr.length;
        
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 8, 2, 7, 3, 6, 4};
        
        System.out.println("Array before sorting:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        
        ins(arr);
        
        System.out.println("\nArray after sorting:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
