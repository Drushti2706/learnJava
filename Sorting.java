 import java.util.*;
 
 public class  Sorting {
     public static void printArray(int arr[]) {
            for(int i= 0; i<arr.length; i++) {
                    System.out.println(arr[i]+" ");
            }
            System.out.println();
     }   
     public static void main(String[] args) {
        int arr[] = { 89,38,16,2,78};
        //insertion sort
        for(int i=1; i<arr.length; i++) {
                 int current = arr[i];
                 int j = i - 1;
                    while (j >= 0 && arr[j]> current) {
                        //keep swaping
                        arr[j + 1] = arr[j];
                        j--;
                    }
                    arr[j+1] = current;
        }
        printArray(arr);
     } 
}
 