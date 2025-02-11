//import java.util.*;
  //  public class recursion {
    //    public static String revString(String str) {
      //      if(str.length() == 1)  {
        //        return str;
          //  }
//
  //          char currChar = str.charAt(0);
    //        String nextString = revString(str.substring(1));
      //      return nextString + currChar;
        //}
       //public static void main(String[] args) {
        
       

         //   String str = "PramodKumar";
           // String reversed = revString(str);
            //System.out.println(reversed);

        //}
    //}

    import java.util.*;
      public class recursion {
        public  static void main(String args[]){}
        public static void quikSort(int arr[], int low, int high) {
            if(low < high){
                    int pi = partition(arr, low, high);

                    quikSort(arr, low, pi - 1);
                    quikSort(arr, pi +1, high);
                   
            }
        }
            public static int partition(int[] arr, int low, int high) {
                int pivot = arr[high];
                int i = low-1;
                    for(int j=low; j<high; j++) {
                        if (arr[j] < pivot) {
                            i++;
                            //swap
                            int temp = arr [i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                    //swap with pivot 
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[high];
                    arr[high] = temp;
                    return i;
                
            }
      } 


