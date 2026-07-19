package Array;

import java.util.Scanner;

public class Que2 {
  public static void main(String[] args) {
     System.out.print("Enter array size: ");
     Scanner sc  = new Scanner(System.in);
      int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<arr.length; i++ ){
   arr[i] = sc.nextInt();
    }
int x = 0;
    for(int i = 0; i<arr.length; i++ ){
     x += arr[i];
  }
  System.out.println("Sum of array elements: " + x);
}
}
