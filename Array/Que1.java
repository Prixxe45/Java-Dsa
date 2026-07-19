package Array;

public class Que1 {
  public static void main(String[] args){
  int[] arr = {23, -15, 8, -42, 67, -9, 14, -31, 56, -78};
for(int i = 0; i<arr.length; i++){
  if(arr[i] < 0){
    System.out.println(arr[i]);
  }
  }
}
}