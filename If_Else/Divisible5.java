package If_Else;

import java.util.Scanner;

public class Divisible5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter Number:");
    int x = sc.nextInt();
    if(x%5 == 0){
      System.out.print("Divisible by 5");
    }else{
      System.out.println("not divisible by 5");
    }
  }
}
