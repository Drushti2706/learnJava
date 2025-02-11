//import java.util.*;
 
//public class Patterns {
  //  public static void main(String args[]) {
    //    int n = 4;
      
//
  //      for(int i=1; i<=n; i++) {
    //        for(int j=1; j<=i; j++) {
      //          System.out.print("*");
        //      }
          // int spaces = 2 * (n-i);
           //for (int j=i; j<=spaces; j++) {
            //System.out.print(" ");
           //}
           //
           //for(int j=1; j<=i; j++){
            //System.out.print("*");
           //}
           //System.out.println();
        //}
        //for(int i=n; i>=1; i--) {
          //  for(int j=1; j<=i; j++) {
            //    System.out.print("*");
              //}
              //int spaces = 2 * (n-i);
           //for (int j=1; j<=spaces; j++) {
            //System.out.print(" ");
           //}
           //for(int j=1; j<=i; j++){

            //System.out.print("*");
           //}
           //System.out.println();
  //      }//
        
//} 

import java.util.*;
 
public class Patterns {
    public static void main(String[] args){
        int rows = 5;
        for(int i = 1; i<= rows; i++) {
            for(int j = rows - i; j> 0; j--) {
                System.out.println(" ");
            }
            for(int k= 1; k <=(2 * i - 1);  k++) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
     