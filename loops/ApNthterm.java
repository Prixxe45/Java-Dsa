package loops;

import java.util.Scanner;

public class ApNthterm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //2,5,8,11,....
    for(int i=2; i<=3*n-1; i += 3){
      System.out.println(i);
    }
      }
}
