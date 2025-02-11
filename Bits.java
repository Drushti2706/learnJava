//import java.util.*;

//public class Bits {
  //      public static void main(String[] args) {
    //        int n = 5; //0101
      //      int pos = 2;
        //    int bitMask = 1<<pos;
//
  //          if ((bitMask & n) == 0) {
    //                System.out.println("bit was zero");
      //      } else {
        //        System.out.println("bit was one");
          //  }
        //}
    
//}

//import java.util.*;

//public class Bits {
  //      public static void main(String[] args) {
    //        int n = 5; //0101
      //      int pos = 2;
        //    int bitMask = 1<<pos;
//
  //          int newBitMask = ~ (bitMask);
    //        int newNumber = newBitMask & n;
      //      System.out.println(newNumber);
        //}
//}    

import java.util.*;

public class Bits {
        public static void printArray(int arr[])
         {
                for(int i=0; i<arr.length; i++)
              {
                    System.out.println(arr[i]+" ");
              }
            System.out.println();  
        }
        public static void main(String[] args) {
             int arr[] = {25,86,1,65,74};

             //bubble sort
             for(int i=0; i<arr.length-1; i++) {
                    for(int j=0; j<arr.length-i-1; j++) {
                            if(arr[j] > arr[j+1]) {
                                //swap
                                int temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                            }
                    }
             }
             printArray(arr);
        }
    }   