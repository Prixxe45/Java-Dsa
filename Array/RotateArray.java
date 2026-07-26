package Array;

import java.util.Scanner;

public class RotateArray {
  public static void main(String[] args) {
      int[] arr = {24, 45, 76, 69,65, 91, 20, 34};
      int n = arr.length;
     Scanner sc  = new Scanner(System.in);
     System.out.print("Enter Number You want to rotate: ");
     int k = sc.nextInt();
      int i = 0, j = n-1;
      while(i<j){
        if(i<k){
          int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    i++;
    j--;
        }
        else{
          break;
        }
    
      }
     for(int elem: arr){
       System.out.println(elem);
     }
  }
}
