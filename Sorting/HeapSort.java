package Sorting;

public class HeapSort {
    
    public static void heapSort(int[] arr) {
        int n = arr.length;
        
        for(int i = n / 2 - 1; i >= 0; i--) {
            heap(arr, n, i);
        }
        for(int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heap(arr, i, 0);
        }
    }
    public static void heap(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if(left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heap(arr, n, largest);
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 8, 2, 7, 3, 6, 4};
        
        System.out.println("Array before sorting:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        
        heapSort(arr);
        
        System.out.println("\nArray after sorting:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}