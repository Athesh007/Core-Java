package Sorting;

public class BubbleSort {
    
    public static void bes(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 8, 2, 7, 3, 6, 4};
        
        System.out.println("Array before sorting:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        
        bes(arr);
        
        System.out.println("\nArray after sorting:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
