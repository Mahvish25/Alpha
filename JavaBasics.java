import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

// import java.util.Scanner;
public class JavaBasics {
    public static void main(String[] args) {

      //System.out.println("Please Enter any number: ");
      //Scanner sc = new Scanner(System.in);

      int arr [] = {1,2,3,4,5};
      bubbleSort(arr);
      //printArray(arr);

    }

    public static void bubbleSort(int arr[]) {
      for (int i = 0; i < arr.length -1; i++) {

        int swap = 0;

        for (int j = 0; j < arr.length-i-1; j++) {

          while (arr[j] > arr[j+1]) {

            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            swap ++;
          }    
            
          }
          System.out.println(swap);
        }
    
      }

    public static void printArray(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
    
  }

    
