package Pattern;

import java.util.Scanner;

//rows or colum ka input alag hoga isiliye 2 variable banege

public class StarRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Rows: ");
    int row = sc.nextInt();
    System.out.print("Enter Col: ");
    int col = sc.nextInt();

    for(int i = 1; i<=row; i++){//kitni rows hai
      for(int j = 1; j<=col; j++){
        System.out.print((char)j + " ");//har row mai kitne star hai
      }
      System.out.println();
    }
  }
}
