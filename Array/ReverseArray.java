package Array;

public class ReverseArray {
public static void main(String[] args) {
  int[] arr = {24, 45, 76, 69,65, 91, 20, 34};
  int n = arr.length;
  System.out.println(n);

  int i = 0, j = n-1;
  while(i<j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    i++;
    j--;
  }
  for(int elem: arr){
    System.out.println(elem);
  }
}
  
}