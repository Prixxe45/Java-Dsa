package Pattern;

import java.util.Scanner;

public class HowwlowRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Rows: ");
    int row = sc.nextInt();
    System.out.print("Enter Col: ");
    int col = sc.nextInt();

 for(int i = 1; i<=row; i++){
 for(int j = 1; j<=col; j++){
if(i == 1 || i == row || j == 1 || j == col){
  System.out.print("x 34");
  }else{
  System.out.print("  ");
}
 }
 System.out.println();
 }
  }
}
