package If_Else;

import java.util.Scanner;

public class IntegerOrNot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number");
    double n  = sc.nextDouble();
    int x = (int)n;
    if(n-x > 0) System.out.println("is not an integer");
    else System.out.println("Integer");
  }
}
