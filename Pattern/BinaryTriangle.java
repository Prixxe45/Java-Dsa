package Pattern;

import java.util.Scanner;

public class BinaryTriangle {
  public static void main(String[] args) {
    Scanner sc  =  new Scanner(System.in);
    System.out.print("Enter Number: ");
    int n = sc.nextInt();
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=i; j++){
        if(j == 1){
          System.out.print("1");
        }else {
          System.out.print(j*2-1);
        }
      }
      System.out.println();
    }
  }
}
