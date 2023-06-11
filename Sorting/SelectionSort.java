package Sorting;

public class SelectionSort {
    
    public static void sns(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 8, 2, 7, 3, 6, 4};
        
        System.out.println("Array before sorting:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        
        sns(arr);
        
        System.out.println("\nArray after sorting:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
