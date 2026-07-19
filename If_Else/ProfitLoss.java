package If_Else;

import java.util.Scanner;

public class ProfitLoss {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Bp");
    double x = sc.nextDouble();
    System.out.print("Enter Sp");
    double y = sc.nextDouble();

    if(x > y) {
 double loss = x-y;
 double lp = loss * 100 / x;
 System.out.println("Persentage of Loss "+lp+"%");
    }else if(x < y){
  double profit = y-x;
  double pp = profit * 100 / x;
  System.out.println("Prsentage of Profit "+pp+"%");
    } 
    else System.out.println("No profit no loss");
  }
}
