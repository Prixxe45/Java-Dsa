package Array;

import java.util.Arrays;

public class Seprate0and1 {
  public static void main(String[] args) {
    int[] arr = {0,1,1,1,0,0,1,1,0,1,1,0,1,0,1,0,0,0,0,0};
    int n = arr.length;
    int zeroCount = 0;
    for(int i = 0; i<n ; i++){
     if(arr[i] == 0){
      zeroCount++;
     }
    }
   
   for(int i = 0; i < n; i++){
    if (i < zeroCount) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
   }
    System.out.println(Arrays.toString(arr));
  }
}
